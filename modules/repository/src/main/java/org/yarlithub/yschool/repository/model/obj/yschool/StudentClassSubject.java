package org.yarlithub.yschool.repository.model.obj.yschool;

import com.felees.hbnpojogen.persistence.IPojoGenEntity;
import java.io.Serializable;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
import org.hibernate.proxy.HibernateProxy;
import org.yarlithub.yschool.repository.model.obj.yschool.iface.IStudentClassSubject;


/** 
 * Object mapping for hibernate-handled table: student_class_subject.
 * @author autogenerated
 */

@Entity
@Table(name = "student_class_subject", schema = "yschool")
public class StudentClassSubject implements Cloneable, Serializable, IPojoGenEntity, IStudentClassSubject {

	/** Serial Version UID. */
	private static final long serialVersionUID = -559009376L;

	/** Use a WeakHashMap so entries will be garbage collected once all entities 
		referring to a saved hash are garbage collected themselves. */
	private static final Map<Serializable, Integer> SAVED_HASHES =
		Collections.synchronizedMap(new WeakHashMap<Serializable, Integer>());
	
	/** hashCode temporary storage. */
	private volatile Integer hashCode;
	

	/** Field mapping. */
	private ClassStudent classStudentIdclassStudent;
	/** Field mapping. */
	private ClassSubject classSubjectIdclassSubject;
	/** Field mapping. */
	private Integer id = 0; // init for hibernate bug workaround
	/**
	 * Default constructor, mainly for hibernate use.
	 */
	public StudentClassSubject() {
		// Default constructor
	} 

	/** Constructor taking a given ID.
	 * @param id to set
	 */
	public StudentClassSubject(Integer id) {
		this.id = id;
	}
	
	/** Constructor taking a given ID.
	 * @param classStudentIdclassStudent ClassStudent object;
	 * @param classSubjectIdclassSubject ClassSubject object;
	 * @param id Integer object;
	 */
	public StudentClassSubject(ClassStudent classStudentIdclassStudent, ClassSubject classSubjectIdclassSubject, Integer id) {

		this.classStudentIdclassStudent = classStudentIdclassStudent;
		this.classSubjectIdclassSubject = classSubjectIdclassSubject;
		this.id = id;
	}
	
 


 
	/** Return the type of this class. Useful for when dealing with proxies.
	* @return Defining class.
	*/
	@Transient
	public Class<?> getClassType() {
		return StudentClassSubject.class;
	}
 

    /**
     * Return the value associated with the column: classStudentIdclassStudent.
	 * @return A ClassStudent object (this.classStudentIdclassStudent)
	 */
	@ManyToOne( cascade = { CascadeType.PERSIST, CascadeType.MERGE }, fetch = FetchType.LAZY )
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE})
	@Basic( optional = false )
	@JoinColumn(name = "Class_Student_idClass_Student", nullable = false )
	public ClassStudent getClassStudentIdclassStudent() {
		return this.classStudentIdclassStudent;
		
	}
	

  
    /**  
     * Set the value related to the column: classStudentIdclassStudent.
	 * @param classStudentIdclassStudent the classStudentIdclassStudent value you wish to set
	 */
	public void setClassStudentIdclassStudent(final ClassStudent classStudentIdclassStudent) {
		this.classStudentIdclassStudent = classStudentIdclassStudent;
	}

    /**
     * Return the value associated with the column: classSubjectIdclassSubject.
	 * @return A ClassSubject object (this.classSubjectIdclassSubject)
	 */
	@ManyToOne( cascade = { CascadeType.PERSIST, CascadeType.MERGE }, fetch = FetchType.LAZY )
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE})
	@Basic( optional = false )
	@JoinColumn(name = "Class_Subject_idClass_Subject", nullable = false )
	public ClassSubject getClassSubjectIdclassSubject() {
		return this.classSubjectIdclassSubject;
		
	}
	

  
    /**  
     * Set the value related to the column: classSubjectIdclassSubject.
	 * @param classSubjectIdclassSubject the classSubjectIdclassSubject value you wish to set
	 */
	public void setClassSubjectIdclassSubject(final ClassSubject classSubjectIdclassSubject) {
		this.classSubjectIdclassSubject = classSubjectIdclassSubject;
	}

    /**
     * Return the value associated with the column: id.
	 * @return A Integer object (this.id)
	 */
    @Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Basic( optional = false )
	@Column( name = "idstudent_class_subject", nullable = false  )
	public Integer getId() {
		return this.id;
		
	}
	

  
    /**  
     * Set the value related to the column: id.
	 * @param id the id value you wish to set
	 */
	public void setId(final Integer id) {
		// If we've just been persisted and hashCode has been
		// returned then make sure other entities with this
		// ID return the already returned hash code
		if ( (this.id == null || this.id == 0) &&
				(id != null) &&
				(this.hashCode != null) ) {
		SAVED_HASHES.put( id, this.hashCode );
		}
		this.id = id;
	}


   /**
    * Deep copy.
	* @return cloned object
	* @throws CloneNotSupportedException on error
    */
    @Override
    public StudentClassSubject clone() throws CloneNotSupportedException {
		
        final StudentClassSubject copy = (StudentClassSubject)super.clone();

		copy.setClassStudentIdclassStudent(this.getClassStudentIdclassStudent());
		copy.setClassSubjectIdclassSubject(this.getClassSubjectIdclassSubject());
		copy.setId(this.getId());
		return copy;
	}
	


	/** Provides toString implementation.
	 * @see java.lang.Object#toString()
	 * @return String representation of this class.
	 */
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		
		sb.append("id: " + this.getId());
		return sb.toString();		
	}


	/** Equals implementation. 
	 * @see java.lang.Object#equals(java.lang.Object)
	 * @param aThat Object to compare with
	 * @return true/false
	 */
	@Override
	public boolean equals(final Object aThat) {
		Object proxyThat = aThat;
		
		if ( this == aThat ) {
			 return true;
		}

		
		if (aThat instanceof HibernateProxy) {
 			// narrow down the proxy to the class we are dealing with.
 			try {
				proxyThat = ((HibernateProxy) aThat).getHibernateLazyInitializer().getImplementation(); 
			} catch (org.hibernate.ObjectNotFoundException e) {
				return false;
		   	}
		}
		if (aThat == null)  {
			 return false;
		}
		
		final StudentClassSubject that; 
		try {
			that = (StudentClassSubject) proxyThat;
			if ( !(that.getClassType().equals(this.getClassType()))){
				return false;
			}
		} catch (org.hibernate.ObjectNotFoundException e) {
				return false;
		} catch (ClassCastException e) {
				return false;
		}
		
		
		boolean result = true;
		result = result && (((this.getId() == null) && ( that.getId() == null)) || (this.getId() != null  && this.getId().equals(that.getId())));
		result = result && (((getClassStudentIdclassStudent() == null) && (that.getClassStudentIdclassStudent() == null)) || (getClassStudentIdclassStudent() != null && getClassStudentIdclassStudent().getId().equals(that.getClassStudentIdclassStudent().getId())));	
		result = result && (((getClassSubjectIdclassSubject() == null) && (that.getClassSubjectIdclassSubject() == null)) || (getClassSubjectIdclassSubject() != null && getClassSubjectIdclassSubject().getId().equals(that.getClassSubjectIdclassSubject().getId())));	
		return result;
	}
	
	/** Calculate the hashcode.
	 * @see java.lang.Object#hashCode()
	 * @return a calculated number
	 */
	@Override
	public int hashCode() {
		if ( this.hashCode == null ) {
			synchronized ( this ) {
				if ( this.hashCode == null ) {
					Integer newHashCode = null;

					if ( getId() != null ) {
					newHashCode = SAVED_HASHES.get( getId() );
					}
					
					if ( newHashCode == null ) {
						if ( getId() != null && getId() != 0) {
							newHashCode = getId();
						} else {

						}
					}
					
					this.hashCode = newHashCode;
				}
			}
		}
	return this.hashCode;
	}
	

	
}
