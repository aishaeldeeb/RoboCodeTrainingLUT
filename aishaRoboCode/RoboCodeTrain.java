package aishaRoboCode;

import robocode.Robot;

import java.io.File;
import java.io.IOException;

public class RoboCodeTrain extends Robot implements LUTInterface{
    /**
     * @param X The input vector. An array of doubles.
     * @return The value returned by th LUT or NN for this input vector
     */

    int x = 0;
    @Override
    public double outputFor(double[] X) {
        return 0;
    }

    /**
     * This method will tell the NN or the LUT the output
     * value that should be mapped to the given input vector. I.e.
     * the desired correct output value for an input.
     *
     * @param X        The input vector
     * @param argValue The new value to learn
     * @return The error in the output for that input vector
     */
    @Override
    public double train(double[] X, double argValue) {
        return 0;
    }

    /**
     * A method to write either a LUT or weights of aneural net to a file.
     *
     * @param argFile of type File.
     */
    @Override
    public void save(File argFile) {

    }

    /**
     * Loads the LUT or neural net weights from file. The load must of course
     * have knowledge of how the data was written out by the save method.
     * You should raise an error in the case that an attempt is being
     * made to load data into an LUT or neural net whose structure does not match
     * the data in the file. (e.g. wrong number of hidden neurons).
     *
     * @param argFileName
     * @throws IOException
     */
    @Override
    public void load(String argFileName) throws IOException {

    }

    /**
     * Initialise the look up table to all zeros.
     */
    @Override
    public void initialiseLUT() {

    }

    /**
     * A helper method that translates a vector being used to index the look up table
     * into an ordinal that can then be used to access the associated look up table element.
     *
     * @param X The state action vector used to index the LUT
     * @return The index where this vector maps to
     */
    @Override
    public int indexFor(double[] X) {
        return 0;
    }
}
