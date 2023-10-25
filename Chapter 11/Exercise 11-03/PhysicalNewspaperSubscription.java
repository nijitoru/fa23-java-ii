public class PhysicalNewspaperSubscription extends NewspaperSubscription
{
    public void setAddress(String a)
    {
        boolean flag = false;
        char[] chars = a.toCharArray();
        for(char c : chars){
            if(Character.isDigit(c)){
                flag = true;
                break;
            }
        }
        if(flag){
            this.address = a;
            this.rate = 15.0;
        } else {
            System.out.println("Invalid address");
            this.address = a;
            this.rate = 0.0;
        }
    }

}

