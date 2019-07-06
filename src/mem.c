int main(int argc, char **argv) {
int i = 0;
for (i = 0; i < 100000000000; i++) {
malloc(3200000);
}
exit (0);
}
