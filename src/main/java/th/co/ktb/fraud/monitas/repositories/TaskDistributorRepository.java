package th.co.ktb.fraud.monitas.repositories;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import th.co.ktb.fraud.monitas.models.Case;


@Repository
public interface TaskDistributorRepository extends PagingAndSortingRepository<Case, Integer>{

	@Query(value = "select distinct mula.user_id \n"
			+ "from mnt_user_login_attemp mula\n"
			+ "left join (select user_id,count(*) taskCount from mnt_case where status in ('PENDING','ASSIGNED','ASSIGNED_BY_SUP') and user_id is not null group by user_id) caseCount on mula.user_id = caseCount.user_id \n"
			+ "where mula.user_id in\n"
			+ "(\n"
			+ "	select u.id from mnt_user_group mug \n"
			+ "	inner join mnt_user u on mug.user_id = u.id \n"
			+ "	where mug.group_id in (:groupIds) and u.active = true\n"
			+ ")\n"
			+ "and mula.active = true\n"
			+ "and taskcount is null",nativeQuery = true)
	public List<Integer> getAvailableUserByGroups(@Param("groupIds")List<Double> groupIds);
	
	@Query("select c from Case c where status = 'PENDING' and user_id is null order by alert_datetime asc")
	public Page<Case> getCaseToDistribute(Pageable pageable);
	
}
