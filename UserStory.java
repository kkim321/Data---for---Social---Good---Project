import java.util.Scanner;

public class UserStory {

private String[] breed;
private int[] age;
private String[] color;
private String[] size;
private String[] healthCondition;
private int[] adoptionFee;

public UserStory(String breedFile, String ageFile, String colorFile, String sizeFile, String hcFile, String afFile){
  breed = FileReader.toStringArray(breedFile);
  age = FileReader.toIntArray(ageFile);
  color = FileReader.toStringArray(colorFile);
  size = FileReader.toStringArray(sizeFile);
  healthCondition = FileReader.toStringArray(hcFile);
  adoptionFee = FileReader.toIntArray(afFile);
}

  public String toString(){
    //create how i want to represent the data
    String result = "";

    for (int i=0; i <breed.length; i++) {
      String breedText = "\nBreed: " + breed[i];
      String ageText = "\nAge: " + age[i];
      String colorText = "\nColo: " + color[i];
      String sizeText = "\nSize: " + size[i];
      String hcText = "\nHGealth Condition: " + healthCondition[i];
      String feeText = "\nFee: $" + adoptionFee[i];
      result += breedText + ageText + colorText + sizeText + hcText + feeText + "\n";
    }
    
    return result;
  }

/*
creating methods for the different options (golden retriver)
it is going to run through a for loop and various if statments to spit out the desried dog
  */ 
public void findGoldenBySize(){
  Scanner input = new Scanner(System.in);
    System.out.println("What size dog are you looking for? (Small, Medium, Large): ");
    String userSize = input.nextLine();

// traversing the breeds to find golden pups
for (int i = 0; i < breed.length; i++){
 if(breed[i].equals("Golden Retriever")){
   if (size[i].equals(userSize)){
     String hc = "";
     if(healthCondition[i].equals("0")){
       hc += "No health condition";
     } else {
       hc += "Has a health condition";
     }
     System.out.println("Age: " + age[i] + 
                        "\nColor: " + color[i] + 
                        "\nHealth Condition: " + hc + 
                        "\nAdoption Fee: $" + adoptionFee[i] + 
                        "\n");
     
   }
 } 
}
  input.close();
}

/*
creating methods for the different options (golden retriver)
it is going to run through a for loop and various if statments to spit out the desried dog
  */
public void findPoodleBySize(){
  Scanner input = new Scanner(System.in);
    System.out.println("What size dog are you looking for? (Small, Medium, Large): ");
    String userSize = input.nextLine();

// traversing the breeds to find poodle pups
for (int i = 0; i < breed.length; i++){
 if(breed[i].equals("Poodle")){
   if (size[i].equals(userSize)){
     String hc = "";
     if(healthCondition[i].equals("0")){
       hc += "No health condition";
     } else {
       hc += "Has a health condition";
     }
     System.out.println("Age: " + age[i] + 
                        "\nColor: " + color[i] + 
                        "\nHealth Condition: " + hc + 
                        "\nAdoption Fee: $" + adoptionFee[i] + 
                        "\n");
     
   }
 } 
} 
  input.close();
}
/*
creating methods for the different options (golden retriver)
it is going to run through a for loop and various if statments to spit out the desried dog
  */
public void findLabradorBySize(){
  Scanner input = new Scanner(System.in);
    System.out.println("What size dog are you looking for? (Small, Medium, Large): ");
    String userSize = input.nextLine();

// traversing the breeds to find Labrador
for (int i = 0; i < breed.length; i++){
 if(breed[i].equals("Labrador")){
   if (size[i].equals(userSize)){
     String hc = "";
     if(healthCondition[i].equals("0")){
       hc += "No health condition";
     } else {
       hc += "Has a health condition";
     }
     System.out.println("Age: " + age[i] + 
                        "\nColor: " + color[i] + 
                        "\nHealth Condition: " + hc + 
                        "\nAdoption Fee: $" + adoptionFee[i] + 
                        "\n");
     
   }
 } 
}
  input.close();
}

// Creating the method for the User Interaction
  public int giveUserOption(){
    Scanner input = new Scanner(System.in);
    System.out.println("What dog are you interested in adopting? Please select on of the following: ");
    System.out.println("1. Golden Retriver");
    System.out.println("2. Labrador");
    System.out.println("3. Poodle");
    int option = input.nextInt();
    input.nextLine();
    input.close();
    return option;
  }
//creating scanner to allow user input to continue
public String promptUserToContinue() {
    Scanner input = new Scanner(System.in);
    System.out.println("\nContinue?");
    System.out.println("Enter \"y\" for yes or \"n\" for no:");
    String choice = input.nextLine();
    input.close();
    return choice;
  }

  
}