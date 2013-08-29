package org.yarlithub.yschool.repository.model.obj.yschool.iface;
import org.yarlithub.yschool.repository.model.obj.yschool.Section;
import org.yarlithub.yschool.repository.model.obj.yschool.StaffHasRole;


/** 
 * Object interface mapping for hibernate-handled table: section_has_staff_has_role.
 * @author autogenerated
 */

public interface ISectionHasStaffHasRolePK {



    /**
     * Return the value associated with the column: sectionIdsection.
	 * @return A Section object (this.sectionIdsection)
	 */
	Section getSectionIdsection();
	

  
    /**  
     * Set the value related to the column: sectionIdsection.
	 * @param sectionIdsection the sectionIdsection value you wish to set
	 */
	void setSectionIdsection(final Section sectionIdsection);

    /**
     * Return the value associated with the column: staffHasRoleIdstaffHasRole.
	 * @return A StaffHasRole object (this.staffHasRoleIdstaffHasRole)
	 */
	StaffHasRole getStaffHasRoleIdstaffHasRole();
	

  
    /**  
     * Set the value related to the column: staffHasRoleIdstaffHasRole.
	 * @param staffHasRoleIdstaffHasRole the staffHasRoleIdstaffHasRole value you wish to set
	 */
	void setStaffHasRoleIdstaffHasRole(final StaffHasRole staffHasRoleIdstaffHasRole);

	// end of interface
}