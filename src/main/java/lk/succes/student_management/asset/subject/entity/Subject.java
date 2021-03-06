package lk.succes.student_management.asset.subject.entity;


import com.fasterxml.jackson.annotation.JsonFilter;

import lk.succes.student_management.asset.batch.entity.Batch;
import lk.succes.student_management.asset.student.entity.Student;
import lk.succes.student_management.asset.teacher.entity.Teacher;
import lk.succes.student_management.util.audit.AuditEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import java.util.List;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonFilter( "Subject" )
public class Subject extends AuditEntity {

    private String code;

    private String name;

    @OneToMany(mappedBy = "subject")
    private List< Batch > batches;

    @ManyToMany(mappedBy = "subjects")
    private List< Student > students;

    @OneToMany(mappedBy = "subject")
    private List< Teacher > teachers;


}