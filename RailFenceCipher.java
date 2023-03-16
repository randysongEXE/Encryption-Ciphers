public class RailFenceCipher {


    public String encrypt(String message, int rails) {
        StringBuilder[] fence = new StringBuilder[rails];
        for (int i = 0; i < rails; i++) {
            fence[i] = new StringBuilder();
        }
        int currentRail = 0;
        boolean goingDown = true;
        for (char c : message.toCharArray()) {
            fence[currentRail].append(c);
            if (goingDown) {
                currentRail++;
                if (currentRail == rails) {
                    currentRail -= 2;
                    goingDown = false;
                }
            } else {
                currentRail--;
                if (currentRail == -1) {
                    currentRail += 2;
                    goingDown = true;
                }
            }
        }

        StringBuilder result = new StringBuilder();
        for (StringBuilder rail : fence) {
            result.append(rail.toString());
        }
        return result.toString();
    }


    public String decrypt(String encrypted, int rails) {
        StringBuilder[] fence = new StringBuilder[rails];
        for (int i = 0; i < rails; i++) {
            fence[i] = new StringBuilder();
        }

        int[] railSizes = new int[rails];
        int currentRail = 0;
        boolean goingDown = true;
        for (int i = 0; i < encrypted.length(); i++) {
            railSizes[currentRail]++;
            if (goingDown) {
                currentRail++;
                if (currentRail == rails) {
                    currentRail -= 2;
                    goingDown = false;
                }
            } else {
                currentRail--;
                if (currentRail == -1) {
                    currentRail += 2;
                    goingDown = true;
                }
            }
        }

        int currentIndex = 0;
        for (int i = 0; i < rails; i++) {
            for (int j = 0; j < railSizes[i]; j++) {
                fence[i].append(encrypted.charAt(currentIndex));
                currentIndex++;
            }
        }

        StringBuilder result = new StringBuilder();
        currentRail = 0;
        goingDown = true;
        int[] fenceIndices = new int[rails];
        for (int i = 0; i < encrypted.length(); i++) {
            result.append(fence[currentRail].charAt(fenceIndices[currentRail]));
            fenceIndices[currentRail]++;
            if (goingDown) {
                currentRail++;
                if (currentRail == rails) {
                    currentRail -= 2;
                    goingDown = false;
                }
            } else {
                currentRail--;
                if (currentRail == -1) {
                    currentRail += 2;
                    goingDown = true;
                }
            }
        }

        return result.toString();
    }

}
