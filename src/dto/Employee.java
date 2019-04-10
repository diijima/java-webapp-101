package dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

	private String employee;	// 社員番号
	private String oano;		// OA番号
	private String sei;		// 姓
	private String mei;		// 名字
	private String name;		// 氏名（漢字）
	private String namek;		// 氏名（カナ）
	private String bu;			// 所属部署
	private String gr;			// 所属グルーブ
	private String indate;		// 作成日
	private String intime;		// 作成時間
	private String update;		// 更新日
	private String uptime;		// 更新時間

	// コンストラクタ
	public Employee(String oano, String name) {
		this.oano = oano;
		this.name = name;
	}
}