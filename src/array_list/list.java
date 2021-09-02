package array_list;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;


public final class list {

	public static void main(String[] args) {
		
	String menu[]= {"Add pet","Update","Search","View all","Delete","End"};
	
	ArrayList<String>pet_name=new ArrayList();
	ArrayList<String>pet_age=new ArrayList();
	ArrayList<String>pet_gender=new ArrayList();
	
	JOptionPane jop=new JOptionPane();
	String choice ="",value="",search="",hold="",age,gender;
	do {
		choice=jop.showInputDialog(null, "Menu","Select",1,null,menu,menu[0]).toString();
		switch(choice) {
		case "Add pet":
			value =jop.showInputDialog("Type pet's name");
			
			if(pet_name.contains(value.toLowerCase())) {
				
			hold=value + "is already exixting.";
			
		}
		else 
		{
			hold=value+ "is added successfully.";
			age=jop.showInputDialog("Type pet age");
			gender=jop.showInputDialog("Type pet gender");
			pet_name.add(value.toLowerCase());
			pet_age.add(age);
			pet_gender.add(gender);
		}
		
			jop.showMessageDialog(null, hold);
			break;
			
		case "Search":
			search=jop.showInputDialog("Type a pet to search: ");
			if(pet_name.contains(search.toLowerCase())) {
				hold=search+"is found. ";
			}else
			{
				hold=search+"NOT found. ";
	
			{
				jop.showMessageDialog(null,hold);
				
				break;
					
				
				case "View all":
					//jop.showMessageDialog(null, arrlist);
					hold="Name\tAge\tGender\n";
					for (int i=0; i<pet_name.size(); i++) {
						hold+=pet_name.get(i)+"\t"+pet_age.get(i)+"\t"+pet_gender.get(i)+"\n";
						hold+=arrayList.get(i)+"\n";
					} jop.showMessageDialog(null, new JTextArea(hold));
					
					
					break;
				
				case "Delete":
					search=jop.showInputDialog("Type a pet to delete: ");
					pet_name.remove(search);
					jop.showMessageDialog(null, search + " is deleted successfully. ");
					
			}
		}
			while (!choice.equals("End"));
			jop.showMessageDialog(null, " Program clossing... ");
		
			}
			
			
			
		
		}
	}
	}



	