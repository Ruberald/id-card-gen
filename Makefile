# Define source and output directories
SRC_DIR := src
OUT_DIR := out

# Define Java compiler and flags
JAVAC := javac
JAVAC_FLAGS := -d $(OUT_DIR) -cp $(OUT_DIR):$(SRC_DIR)

# Define Java runtime
JAVA := java
JAVA_FLAGS := -cp $(OUT_DIR)

# Define targets
.PHONY: all clean run

all: $(OUT_DIR)/Main.class

$(OUT_DIR)/Main.class: $(SRC_DIR)/views/Main.java $(OUT_DIR)/controllers/IDCardController.class $(OUT_DIR)/controllers/UserController.class $(OUT_DIR)/models/User.class
	$(JAVAC) $(JAVAC_FLAGS) $<

$(OUT_DIR)/%.class: $(SRC_DIR)/%.java
	$(JAVAC) $(JAVAC_FLAGS) $<

clean:
	rm -rf $(OUT_DIR)

run: all
	$(JAVA) $(JAVA_FLAGS) views.Main
