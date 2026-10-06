package in.ashokit.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Student{
  @Id
  //@GeneratedValue(strategy = GenerationType.IDENTITY)
//  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq1")
//  @SequenceGenerator(sequenceName = "id_sequence", name ="seq1",allocationSize = 6)
//  private Long  studentId;
//  private String studentName;
//  private Integer marks;

  @GeneratedValue(strategy = GenerationType.TABLE, generator = "idgen")
  @TableGenerator(
          name = "idgen",
         table = "id_table",
          pkColumnName="id_key",
          valueColumnName= "id_val",
          pkColumnValue= "stu_id",
          allocationSize=10,
          initialValue=0
  )
  private Long  studentId;
  private String studentName;
  private Integer marks;
}

