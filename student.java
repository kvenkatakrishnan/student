class sam{

    String[] arr={"Deepan","venkat","vishnu"};

    int[] id={01,02,03};

    public void student(String Name){
       for (int i = 0; i < arr.length; i++) {
           if(arr[i].equals(Name)){

            System.out.println("id="+id[i]+"  Name="+arr[i]);
           }
           
       }
    }
    public static void main(String[] args){

       
       sam s=new sam();
      

       String Name="vishnu";
      

       s.student(Name);


    }
}