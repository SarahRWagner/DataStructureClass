/** Sarah Wagner Week Seven Assignments
   Problem 32, 48 and 49 Driver Class **/

import ch07.trees.*;
import java.util.*;
import ch04.queues.*;
import ch02.stacks.*;
import support.BSTNode;
import java.util.ArrayList;
import java.util.Random;
import java.text.*;

public class BSTDriver
{

	public static void main(String[] args)
	{

		MyExtendedBinarySearchTree < Integer > testTree = new MyExtendedBinarySearchTree < Integer > ();

		testTree.add(20);
		testTree.add(4);
		testTree.add(6);
		testTree.add(50);
		testTree.add(100);
		testTree.add(5);
		testTree.add(72);
		testTree.add(28);
		testTree.add(9);
		testTree.add(10);


		// Checking if the height methods work
		int height1 = testTree.recursiveHeight(testTree.root);
		System.out.println("Here is the recursive height result: " + height1);

		int height2 = testTree.height(testTree.root);
		System.out.println("Here is the non-recursive height result: " + height2);

		// The fullness ratio
		double ratio = testTree.fRatio(testTree.root);
		System.out.println("Here is the ratio of the regular tree vs balanced tree: " + ratio);

		System.out.println("-------------------------------------------------------------");

		// Create 10 random trees
		ArrayList < MyExtendedBinarySearchTree < Integer >> bstList = new ArrayList < MyExtendedBinarySearchTree < Integer >> ();

		for (int i = 0; i < 10; i++)
		{
			bstList.add(new MyExtendedBinarySearchTree < Integer > ());
		}

		Random randomNum = new Random();
		
		//Filling those 10 random trees with random int nodes
		for (MyExtendedBinarySearchTree < Integer > tree: bstList)
		{

			for (int j = 0; j < 1000; j++)
			{
				tree.add(randomNum.nextInt(3000) + 1);
			} // End of inner for loop

			//Question 48 data            
			int treeHeight = tree.height(tree.root);
			int minTreeHeight = tree.minHeight(tree.root);
			double treeRatio = tree.fRatio(tree.root);

			DecimalFormat df = new DecimalFormat("#.######");

			System.out.println("Height: " + tree.height(tree.root));
			System.out.println("Min Height: " + tree.minHeight(tree.root));
			System.out.println("FRatio: " + df.format(tree.fRatio(tree.root)) + "");
		} // End of outer for loop
		
		//Question 49 
		System.out.println("Enter a number k between 0 and 1");
		Scanner sc = new Scanner(System.in);
		double k = sc.nextDouble();

		// Create the 10 trees filled with varying numbers with the occasional 42 value
		createTree(42, k * 100, 3000);

		for (int p = 0; p < 9; p++)
		{

			for (int n = 0; n < 10; n++)
			{

				createTree(42, 10 * (1 + p), 3000);
			} // End of inner for loop
		} // End of outer for loop


	} // End of main
	
	public static MyExtendedBinarySearchTree < Integer > createTree(int v, double k, int n)
	{
		// Generate Our Tree
		MyExtendedBinarySearchTree < Integer > fillerTree = new MyExtendedBinarySearchTree < Integer > ();
		//Create the percentage
		double kPct = k / 100.0;
		Random rand = new Random();
		
		// Fill the tree with random numbers with the occasional 42
		for (int i = 0; i < n; i++)
		{
			if (rand.nextDouble() < kPct)
			{
				fillerTree.add(v);
			}
			else
			{
				fillerTree.add(1 + rand.nextInt(3000));
			}
		} // End of for loop

		// Print Statistics Out On Tree
		MyExtendedBinarySearchTree < Integer > tree = fillerTree;

		int treeHeight = tree.height(tree.root);
		int minTreeHeight = tree.minHeight(tree.root);
		double treeRatio = tree.fRatio(tree.root);

		DecimalFormat df = new DecimalFormat("#.######");

		System.out.println("Height: " + tree.height(tree.root));
		System.out.println("Min Height: " + tree.minHeight(tree.root));
		System.out.println("FRatio: " + df.format(tree.fRatio(tree.root)) + "");

		// Return Tree
		return fillerTree;
	} // End of createTree method


} // End of program

/*
 An example of the results printed from one run of the Question 48 code: 
 
Height: 21
Min Height: 3
FRatio: 0.14

Height: 22
Min Height: 3
FRatio: 0.14

Height: 23
Min Height: 3
FRatio: 0.13

Height: 19
Min Height: 3
FRatio: 0.16

Height: 21
Min Height: 4
FRatio: 0.19

Height: 20
Min Height: 3
FRatio: 0.15

Height: 25
Min Height: 3
FRatio: 0.12

Height: 23
Min Height: 3
FRatio: 0.13

Height: 23
Min Height: 4
FRatio: 0.17

Height: 21
Min Height: 4
FRatio: 0.19

-----------------------------------------------------------------

Results from the Question 49 code:

Height: 602
Min Height: 3
FRatio: 0.004983

Height: 295
Min Height: 1
FRatio: 0.00339

Height: 322
Min Height: 4
FRatio: 0.012422

Height: 308
Min Height: 4
FRatio: 0.012987

Height: 327
Min Height: 2
FRatio: 0.006116

Height: 320
Min Height: 3
FRatio: 0.009375

Height: 288
Min Height: 2
FRatio: 0.006944

Height: 299
Min Height: 5
FRatio: 0.016722

Height: 314
Min Height: 5
FRatio: 0.015924

Height: 297
Min Height: 3
FRatio: 0.010101

Height: 305
Min Height: 2
FRatio: 0.006557

Height: 610
Min Height: 3
FRatio: 0.004918

Height: 594
Min Height: 3
FRatio: 0.005051

Height: 602
Min Height: 3
FRatio: 0.004983

Height: 648
Min Height: 1
FRatio: 0.001543

Height: 585
Min Height: 3
FRatio: 0.005128

Height: 603
Min Height: 1
FRatio: 0.001658

Height: 589
Min Height: 2
FRatio: 0.003396

Height: 605
Min Height: 2
FRatio: 0.003306

Height: 553
Min Height: 2
FRatio: 0.003617

Height: 580
Min Height: 0
FRatio: 0

Height: 880
Min Height: 3
FRatio: 0.003409

Height: 882
Min Height: 2
FRatio: 0.002268

Height: 884
Min Height: 1
FRatio: 0.001131

Height: 888
Min Height: 1
FRatio: 0.001126

Height: 905
Min Height: 2
FRatio: 0.00221

Height: 944
Min Height: 2
FRatio: 0.002119

Height: 880
Min Height: 1
FRatio: 0.001136

Height: 862
Min Height: 2
FRatio: 0.00232

Height: 877
Min Height: 3
FRatio: 0.003421

Height: 889
Min Height: 3
FRatio: 0.003375

Height: 1234
Min Height: 1
FRatio: 0.00081

Height: 1213
Min Height: 1
FRatio: 0.000824

Height: 1230
Min Height: 1
FRatio: 0.000813

Height: 1247
Min Height: 3
FRatio: 0.002406

Height: 1209
Min Height: 2
FRatio: 0.001654

Height: 1239
Min Height: 4
FRatio: 0.003228

Height: 1217
Min Height: 1
FRatio: 0.000822

Height: 1228
Min Height: 1
FRatio: 0.000814

Height: 1219
Min Height: 3
FRatio: 0.002461

Height: 1210
Min Height: 3
FRatio: 0.002479

Height: 1483
Min Height: 1
FRatio: 0.000674

Height: 1465
Min Height: 2
FRatio: 0.001365

Height: 1484
Min Height: 3
FRatio: 0.002022

Height: 1563
Min Height: 3
FRatio: 0.001919

Height: 1546
Min Height: 2
FRatio: 0.001294

Height: 1466
Min Height: 2
FRatio: 0.001364

Height: 1558
Min Height: 1
FRatio: 0.000642

Height: 1443
Min Height: 1
FRatio: 0.000693

Height: 1476
Min Height: 1
FRatio: 0.000678

Height: 1542
Min Height: 1
FRatio: 0.000649

Height: 1817
Min Height: 1
FRatio: 0.00055

Height: 1777
Min Height: 1
FRatio: 0.000563

Height: 1831
Min Height: 1
FRatio: 0.000546

Height: 1773
Min Height: 1
FRatio: 0.000564

Height: 1786
Min Height: 1
FRatio: 0.00056

Height: 1820
Min Height: 1
FRatio: 0.000549

Height: 1817
Min Height: 1
FRatio: 0.00055

Height: 1834
Min Height: 3
FRatio: 0.001636

Height: 1756
Min Height: 1
FRatio: 0.000569

Height: 1793
Min Height: 1
FRatio: 0.000558

Height: 2130
Min Height: 1
FRatio: 0.000469

Height: 2113
Min Height: 1
FRatio: 0.000473

Height: 2090
Min Height: 1
FRatio: 0.000478

Height: 2155
Min Height: 1
FRatio: 0.000464

Height: 2134
Min Height: 1
FRatio: 0.000469

Height: 2121
Min Height: 2
FRatio: 0.000943

Height: 2087
Min Height: 1
FRatio: 0.000479

Height: 2121
Min Height: 1
FRatio: 0.000471

Height: 2096
Min Height: 1
FRatio: 0.000477

Height: 2116
Min Height: 1
FRatio: 0.000473

Height: 2375
Min Height: 1
FRatio: 0.000421

Height: 2420
Min Height: 1
FRatio: 0.000413

Height: 2404
Min Height: 1
FRatio: 0.000416

Height: 2392
Min Height: 1
FRatio: 0.000418

Height: 2402
Min Height: 1
FRatio: 0.000416

Height: 2370
Min Height: 1
FRatio: 0.000422

Height: 2407
Min Height: 1
FRatio: 0.000415

Height: 2379
Min Height: 2
FRatio: 0.000841

Height: 2343
Min Height: 1
FRatio: 0.000427

Height: 2391
Min Height: 2
FRatio: 0.000836

Height: 2711
Min Height: 1
FRatio: 0.000369

Height: 2678
Min Height: 2
FRatio: 0.000747

Height: 2693
Min Height: 1
FRatio: 0.000371

Height: 2699
Min Height: 1
FRatio: 0.000371

Height: 2676
Min Height: 1
FRatio: 0.000374

Height: 2706
Min Height: 1
FRatio: 0.00037

Height: 2725
Min Height: 1
FRatio: 0.000367

Height: 2690
Min Height: 1
FRatio: 0.000372

Height: 2680
Min Height: 1
FRatio: 0.000373

Height: 2694
Min Height: 1
FRatio: 0.000371




*/