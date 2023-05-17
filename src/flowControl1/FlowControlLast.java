package flowControl1;

import java.util.Arrays;

public class FlowControlLast {
    public static void main(String[] args) {
        int[]nums1=new int[10];
        int[]nums2=new int[10];
        int[]distinct=new int[10];
        for (int i = 0; i < nums1.length; i++) {
            nums1[i]=(int)(Math.random()*10);

        }System.out.println(Arrays.toString(nums1));
        for (int i = 0; i < nums2.length; i++) {
            nums2[i]=(int)(Math.random()*10);
        }
        System.out.println(Arrays.toString(nums2));
        boolean swapped=true;
        int counter=0;
        while (swapped){
            swapped=false;
            for (int i = 0; i < nums1.length-1; i++) {
                if (nums1[i]==0){
                    int temp=nums1[i];
                    nums1[i]=nums1[i+1];
                    nums1[i+1]=temp;
                    swapped=true;
                }
            }counter++;
            if (counter==nums1.length-1)
                break;
        }
        System.out.println(Arrays.toString(nums1));
        int[] nums3=new int[20];
        for (int i = 0; i <nums1.length ; i++) {
            nums3[i]=nums1[i];
            nums3[i+10]=nums2[i];
        }
        System.out.println(Arrays.toString(nums3));
        boolean swapped3=true;
        while (swapped3) {
            swapped3 = false;
            for (int i = 0; i < nums3.length - 1; i++) {
                if (nums3[i] > nums3[i + 1]) {
                    int temp3 = nums3[i];
                    nums3[i] = nums3[i + 1];
                    nums3[i + 1] = temp3;
                    swapped3 = true;
                }

            }
        }
        System.out.println(Arrays.toString(nums3));
        for (int i = 0; i < distinct.length; i++) {
            distinct[i]=-1;
        }boolean isEqual=true;
        int count=0;
        for (int i = 0; i <nums1.length; i++) {

            for (int j = 0; j <nums2.length; j++) {
                if (nums1[i]==nums2[j]){
                    isEqual=true;
                    break;
                }else isEqual=false;
                if (isEqual==false){
                    for (int k = 0; k <count; k++) {
                        if (distinct[k]==nums1[i]){
                            isEqual=true;
                            break;
                        }
                    }
                }
            }  if (isEqual==false){
                distinct[count]=nums1[i];
                count++;
            }
        } System.out.println(Arrays.toString(distinct));

    }
}
