APP	= "public class App {\n\tpublic static void main(String args[]){\n\t\t\n\t}\n}"
MAKEFILE = "all:\n\t@javac App.java src/*.java\n\nrun: clean all\n\t@java App\n\t@echo\n\nclean:\n\t@rm App.class src/*.class\n\t@clear"

# make f=name
all:
	@mkdir $(f) $(f)/src
	@touch $(f)/App.java $(f)/makefile
	@printf $(APP) > $(f)/App.java
	@printf $(MAKEFILE) > $(f)/makefile