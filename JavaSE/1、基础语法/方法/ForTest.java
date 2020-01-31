package JavaSE.OO.fangfa;
/**
 * @author 王迎春
 *For循环例子
 *编写For循环找出1-100中所有的素数
 *
 *知识点：
 *	for循环的使用
 *	for循环嵌套
 *	标记
 *	break
 *	统计
 */
public class ForTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 int i=14;
		 boolean isSuShu=true;//默认将i看做一个素数【标记在开发中比较常用】
		 for(int j=2;j<i;j++) {
			 if(i%j==0) {
				 //非素数
				 isSuShu=true;
				 //已经知道i是非素数，跳出循环，效率较高
				 break;
			 }
		 }
		 System.out.println(isSuShu ? i+"是素数" : i+"不是素数");
		*/
		
		//升级版【加入统计机制】
		int count = 0;
		for(int i=2;i<=100;i++) {
			//这里的代码只判断i是否为素数
			boolean isSuShu=true;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					isSuShu=false;
					break;
				}
			}
			if(isSuShu) {
				System.out.println(i+" ");
				count++;
				if(count==8) {
					System.out.println();
					//归零
					count = 0;
				}
			}
		}
	}

}
