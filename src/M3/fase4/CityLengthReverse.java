package M3.fase4;

public class CityLengthReverse {
    public static void main(String[] args) {

        String city1 = "Barcelona";
        String city2 = "Madrid";
        String city3 = "Valencia";
        String city4 = "Malaga";
        String city5 = "Cadiz";
        String city6 = "Santander";

        // Creating array of string length

        char[] ch1 = city1.toCharArray();
        char[] ch2 = city2.toCharArray();
        char[] ch3 = city3.toCharArray();
        char[] ch4 = city4.toCharArray();
        char[] ch5 = city5.toCharArray();
        char[] ch6 = city6.toCharArray();

        int begin1 = 0;
        int end1 = ch1.length-1;
        char temp1;
        while(end1>begin1){
            temp1 = ch1[begin1];
            ch1[begin1] = ch1[end1];
            ch1[end1] = temp1;
            end1--;
            begin1++;
        }
        System.out.print(city1 + "-");
        city1 = new String(ch1);
        System.out.println(city1);

        int begin2 = 0;
        int end2 = ch2.length-1;
        char temp2;
        while(end2>begin2){
            temp2 = ch2[begin2];
            ch2[begin2] = ch2[end2];
            ch2[end2] = temp2;
            end2--;
            begin2++;
        }
        System.out.print(city2 + "-");
        city2 = new String(ch2);
        System.out.println(city2);

        int begin3 = 0;
        int end3 = ch3.length-1;
        char temp3;
        while(end3 >begin3){
            temp3 = ch3[begin3];
            ch3[begin3] = ch3[end3];
            ch3[end3] = temp3;
            end3--;
            begin3++;
        }
        System.out.print(city3 + "-");
        city3 = new String(ch3);
        System.out.println(city3);

        int begin4 = 0;
        int end4 = ch2.length-1;
        char temp4;
        while(end4 > begin4){
            temp4 = ch4[begin4];
            ch4[begin4] = ch4[end4];
            ch4[end4] = temp4;
            end4--;
            begin4++;
        }
        System.out.print(city4 + "-");
        city4 = new String(ch4);
        System.out.println(city4);

        int begin5 = 0;
        int end5 = ch5.length-1;
        char temp5;
        while(end5 > begin5){
            temp5 = ch5[begin5];
            ch5[begin5] = ch5[end5];
            ch5[end5] = temp5;
            end5--;
            begin5++;
        }
        System.out.print(city5 + "-");
        city5 = new String(ch5);
        System.out.println(city5);

        int begin6 = 0;
        int end6 = ch6.length-1;
        char temp6;
        while(end6 > begin6){
            temp6 = ch6[begin6];
            ch6[begin6] = ch6[end6];
            ch6[end6] = temp6;
            end6--;
            begin6++;
        }
        System.out.print(city6 + "-");
        city6 = new String(ch6);
        System.out.println(city6);
    }
}
