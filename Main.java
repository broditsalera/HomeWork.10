import java.util.Scanner;

//Задача 1
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int a;
//        int Max = Integer.MIN_VALUE;
//        int CountMax = 1;
//        System.out.print("Введите последовательность целых чисел, для завершения введите -1: ");
//        do {
//            a = scanner.nextInt();
//            if (a == Max) {
//                CountMax++;
//            } else if (a > Max) {
//                Max = a;
//                CountMax = 1;
//            }
//        } while (a != -1);
//        System.out.println("Количество максимальных элементов: " + CountMax );
//    }
//}


//Задача 2 (не работает)

//public class Main {
//        public static void main(String[] args) {
//            Scanner scanner = new Scanner(System.in);
//            int a;
//            int k1;                       //Квадрат четного числа
//            int k2;                       //Квадрат нечетного числа
//            int s = 0;                    //Количество различных квадратов
//            System.out.print("Введите последовательность целых чисел, для завершения введите -1: ");
//            do {
//                a = scanner.nextInt();
//                if (a >= 0) {
//                    k1 = (a * a);
//                }
//                if (a <= 0) {
//                    k2 = (a * a);
//                }
//                if (k1 != k2) {
//                    s++;
//                }
//            } while (a != -1);
//            System.out.println("Количество различных квадратов: " + s);
//        }
//    }
//}


//Задача 3

//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        double a;
//        double sum = 0;
//        double k = 0;                    //Количество чисел
//        double l = 0;                    //Среднее арифметическое
//        System.out.print("Введите последовательность целых чисел, для завершения введите -1: ");
//        do {
//            a = scanner.nextDouble();
//            if (a != 0) {
//                k++;
//                sum = sum + a;
//            }
//        } while (a != -1);
//        sum++;
//        k--;
//        l = sum / k;
//        System.out.println("Среднее арифметическое: " + l);
//    }
//}


//Задача 4

//public class Main {
//    public static void four(){
//        int max = 0;
//        int count = 1;
//        int check = 0;
//        try {
//            while (true) {
//                Scanner in = new Scanner(System.in);
//                System.out.println("Введите последовательность чисел: ");
//                int a = in.nextInt();
//                if (a == check){
//                    count++;
//                }
//                else {
//                    count = 1;
//                }
//                if (max < count) {
//                    max = count;
//                }
//                check = a;
//                System.out.println("Максимальное число идущих подряд одинаковых элементов: " + max);
//            }
//        } catch(Exception e) {            //Исключения
//            System.out.println("Введены некорректные данные");
//        }
//    }
//    public static void main(String[] args){
//        four();
//    }
//}


//Задача 5

//public class Main {
//    public static void main(String[] args) {
//            Scanner in = new Scanner(System.in);
//        System.out.println("Введите числа последовательности: ");
//            int x = in.nextInt();
//            String y = in.next();
//            int a = 1;
//            int a1 = 1;
//            int a2 = 0;
//            int Max1 = x;
//            int Max2;
//        while(true)
//            {
//                a++;
//                try {
//                    Max2 = new int (y);
//                } catch (NumberFormatException e) {
//                    break;
//                }
//                if (Max2 > Max1) {
//                    Max1 = Max2;
//                    a1 = a;
//                    a2 = a;
//                } else if (Max2 == Max1) {
//                    a2 = a;
//                }
//                System.out.println("Первое максимальное: " + a1 + ";" + "Второе максимальное: " + a2);
//                y = in.next();
//            }
//        if((a1 ==1) && (a2 ==1) || (a2 < a1))
//            {
//                System.out.println("");
//            } else
//            {
//                System.out.println("Первое максимальное: " + a1 + ";" + "Второе максимальное: " + a2);
//            }
//    }
//}


//Задача 6

//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        long a;
//        long k = 0;                     //Счетчик чисел
//        long s = 0;                     //Номер первого элемента, равного нулю
//        System.out.print("Введите последовательность целых чисел, для завершения введите -1: ");
//        do {
//            a = scanner.nextInt();
//            if (a != 0) {
//                k++;
//            } else {
//                s = k++;
//                break;
//            }
//        } while (a != -1);
//        if (s == 0) {
//            System.out.println(s);
//        }   else {
//            System.out.println("Номер первого элемента, равного нулю: " + (s+1));
//        }
//    }
//}


//Задача 7

//public class Main {
//    public static void main(String[] args) {
//        int num, count;
//        Scanner in = new Scanner(System.in);
//        System.out.println("Введите числа последовательности: ");
//        int num1, count2 = 1;
//        count = 1;
//        num1 = in.nextInt();
//        System.out.println(count2);
//        while (true) {
//            try {
//                num = in.nextInt();
//                if (num > num1) {
//                    num1 = num;
//                    count++;
//                    if (count > count2) {
//                        count2 = count;
//                    }
//                    System.out.println(count2);
//                } else {
//                    num1 = num;
//                    if (count > count2) {
//                        count2 = count;
//                    }
//                    count = 1;
//                    System.out.println(count2);
//                }
//            } catch (Exception e) {
//                break;
//            }
//        }
//        System.out.println(count2);
//    }
//}


//Задача 8

//public class Main {
//    public static void main(String[] args) {
//        int num;
//        Scanner in = new Scanner(System.in);
//        System.out.println("Введите числа последовательности: ");
//        int max1, max2 = 0;
//        max1 = in.nextInt();
//        System.out.println("No");
//        boolean b = false;
//        while (true) {
//            try {
//                num = in.nextInt();
//                if (num > max1) {
//                    max2 = max1;
//                    max1 = num;
//                    System.out.println(max2);
//                    b = true;
//                } else if (num == max1) {
//                    if (b) {
//                        System.out.println(max2);
//                    } else {
//                        System.out.println("No");
//                    }
//                }
//                if (num < max1) {
//                    if (num > max2) {
//                        max2 = num;
//                        System.out.println(max2);
//                    } else {
//                        System.out.println(max2);
//                    }
//                }
//            } catch (Exception e) {      //Исключение
//                break;
//            }
//        }
//        System.out.println(max2);
//    }
//}

//Задача 9 (не работает)



//Задача 10

//public class Main {
//    public static void main(String[] args) {
//        int num;
//        Scanner in = new Scanner(System.in);
//        System.out.println("Введите последовательность целых чисел, для завершения напишите 'стоп': ");
//        int max1 = 1, max2 = 1, c1 = 1, c2 = 1, x;
//        num = in.nextInt();
//        while (true) {
//            try {
//                x = in.nextInt();
//            } catch (Exception e) {
//                break;
//            }
//            if (x > num) {
//                c1++;
//                if (c2 > max2) {
//                    max2 = c2;
//                }
//                c2 = 1;
//                num = x;
//            } else {
//                if (x < num) {
//                    c2++;
//                }
//                if (c1 > max1) {
//                    max1 = c1;
//                }
//                c1 = 1;
//                num = x;
//            }
//            if (c1 > max1) {
//                max1 = c1;
//            }
//            if (c2 > max2) {
//                max2 = c2;
//            }
//            if (c1 > max1) {
//                max1 = c1;
//            }
//            if (max1 > max2) {
//                System.out.println(max1);
//            } else {
//                System.out.println(max2);
//            }
//        }
//    }
//}


//Задача 11

//public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.println("Введите числа 1 или 0: ");  //Вводим каждое с новой строки
//        int x, c1 = 0, c = 0;
//        while (true) {
//        try {
//        x = in.nextInt();
//        } catch (Exception e) {
//        break;
//        }
//        if (x == 1) {
//        c1++;
//        } else {
//        if (c1 > 1) {
//        c++;
//        }
//        }
//        System.out.println(c);
//        }
//    }
//}


//Задача 12

//public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int num, count;
//        System.out.println("Введите числа последовательности: "); //Вводим каждое с новой строки
//        int c = 0;
//        count = 1;
//        while (true) {
//            try {
//                num = in.nextInt();
//                if (num == count) {
//                    if (count == 6) {
//                        count = 1;
//                        c++;
//                    }
//                    count++;
//                }
//                System.out.println(c);
//            } catch (Exception e) {
//                break;
//            }
//        }
//        System.out.println(c);
//    }
//}

//Задача 13

//public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int count = 0;
//        int x;
//        System.out.println("Введите числа последовательности: "); //Вводим каждое с новой строки
//        while (true) {
//        try {
//        x = in.nextInt();
//            if (x == 1) {
//            System.out.println(count);
//            x = in.nextInt();
//            if (x == 2) {
//            System.out.println(count);
//            x = in.nextInt();
//                if (x == 1) {
//                System.out.println(count);
//                x = in.nextInt();
//                    if (x == 2) {
//                    System.out.println(count);
//                    x = in.nextInt();
//                    if (x == 1) {
//                    System.out.println(count);
//                    x = in.nextInt();
//                        if (x == 2) { count++;
//                                    } } } } } }
//        System.out.println(count);
//        } catch (Exception e) {
//        break;
//        }
//        }
//        System.out.println(count);
//    }
//}
