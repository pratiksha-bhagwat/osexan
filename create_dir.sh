read -p " Enter the number of directories to create: " n
for i in $(seq 1 $n);
do
	mkdir dir$i
done
