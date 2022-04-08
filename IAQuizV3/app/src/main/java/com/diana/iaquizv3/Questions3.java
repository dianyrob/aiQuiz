package com.diana.iaquizv3;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Questions3 {
    public void fillQuestion(TextView Quest, Button a, Button b, Button c, Button d, int questions, int question){
        switch (question){
            case 1:
                Quest.setText(questions+". In the offline testing method, the cycle of trying out different combination of algorithms with different hyperparameters is crucial to the train-test model.");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 2:
                Quest.setText(questions+". In the offline testing method, the cycle of trying out different combination of algorithms with different hyperparameters is not important to the train-test model.");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 3:
                Quest.setText(questions+". In the offline testing method, different algorithms with different hyperparameters (parameters influencing an algorithm) are applied on training data and benchmark against test data.");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 4:
                Quest.setText(questions+". In the offline testing method, the same algorithms with the same hyperparameters (parameters influencing an algorithm) are applied on training data and benchmark against test data.");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 5:
                Quest.setText(questions+". In the offline testing method, metrics are computed to judge the best algorithm & hyperparameter combination.");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 6:
                Quest.setText(questions+". In the offline testing method, metrics are computed to find the difference between algorithm & hyperparameter combination.");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 7:
                Quest.setText(questions+". In the offline testing method, once baselined this model is then moved to deployment, either as a standalone AI system or as part of a bigger system.");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 8:
                Quest.setText(questions+". In the offline testing method, once baselined this model is then moved to deployment, only as a standalone AI system and not as part of a bigger system.");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 9:
                Quest.setText(questions+". In the data preparation, the input data could be in the form of database tables, CSV files, or it could be unstructured data such as images, audios, videos or running texts.");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 10:
                Quest.setText(questions+". In the data preparation and preprocessing, the input data should not be in the form of database tables, CSV files, only should be unstructured data such as images, audios, videos or running texts.");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 11:
                Quest.setText(questions+". In the data preparation and preprocessing, the required data is acquired from various sources, internal and external.");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 12:
                Quest.setText(questions+". In the data preparation and preprocessing, the required data is acquired only from internal sources.");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 13:
                Quest.setText(questions+". In the data preparation and preprocessing, after acquisition, the data needs thorough cleanup and some processing before it can be fed to the algorithms for training testing.");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 14:
                Quest.setText(questions+". In the data preparation and preprocessing, after acquisition, the data doesn’t need thorough cleanup and some processing before it can be fed to the algorithms for training testing.");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 15:
                Quest.setText(questions+". Which of the following steps are performed for data preparation and preprocessing?");
                a.setText("A) Data manipulation, Data filtering, Data imputation ");
                b.setText("B) Data visualization, Treating anomalies and outliers");
                c.setText("C) Correlation analysis, Reducing dimensions ");
                d.setText("D)All of the above");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 16:
                Quest.setText(questions+". What activities does include data preprocessing?");
                a.setText("A) Data manipulation, Data filtering");
                b.setText("B) Data imputation, Data visualization ");
                c.setText("C) Data manipulation, Data filtering, Data imputation, Data visualization ");
                d.setText("D)All of the above");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 17:
                Quest.setText(questions+". Several data format (e.g., image, text) specific preprocessing steps need to be performed to make data format suitable for training. When the data volume is too large, perform data-reduction without losing the information. For structured data missing, data values may need to be filled");
                a.setText("A) All such data preprocessing steps are required to obtain desired accuracy and better predictability in the models ");
                b.setText("B) All such data preprocessing steps are required to obtain desired accuracy ");
                c.setText("C) All such data preprocessing steps are required to obtain better predictability in the models ");
                d.setText("D) All such data preprocessing steps are not required ");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 18:
                Quest.setText(questions+". What activities does include data preparation?");
                a.setText("A) Data manipulation, Data filtering");
                b.setText("B) Data imputation, Data visualization ");
                c.setText("C) Data manipulation, Data filtering, Data imputation, Data visualization ");
                d.setText("D)All of the above");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 19:
                Quest.setText(questions+". In the data preparation, is changing the structure of the given data for example, adding a new column, dropping some rows, etc.");
                a.setText("A) Data filtering");
                b.setText("B) Data imputation");
                c.setText("C) Data visualization ");
                d.setText("D) Data manipulation");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 20:
                Quest.setText(questions+". In the data preparation, is reducing the size of both structured (table/matrix) and unstructured (image/text) data for improving data quality.");
                a.setText("A) Data filtering");
                b.setText("B) Data imputation");
                c.setText("C) Data visualization ");
                d.setText("D) Data manipulation");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 21:
                Quest.setText(questions+". In the data preparation, allows to reduce the amount of data needed for processing and can be done by rows, columns or combination of rows and columns, also by specifying conditions.");
                a.setText("A) Data filtering for structured data");
                b.setText("B) Data imputation for structured data");
                c.setText("C) Data visualization for structured data");
                d.setText("D) Data manipulation for structured data");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 22:
                Quest.setText(questions+". In the processing of unstructured data (Images), removing noise from the image and resizing it are the common operations carried out on images for designing computer vision algorithms.");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 23:
                Quest.setText(questions+". In the processing of unstructured data (images), leaving noise in the image and resizing it are the common operations carried out on images for designing computer vision algorithms.");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 24:
                Quest.setText(questions+". In the processing of unstructured data (images), all images input to AI model should be of the same size and common requirements in the image processing.");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 25:
                Quest.setText(questions+". In the processing of unstructured data (images), all images input to AI model should be of the same size and common requirements in the image processing.");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 26:
                Quest.setText(questions+". In the processing of unstructured data (images), noise removal is used as pre-processing  stage in computer vision algorithms to enhance image structures at different scales.");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 27:
                Quest.setText(questions+". In the processing of unstructured data (images), noise removal is used as post-processing  stage in computer vision algorithms to enhance image structures at different scales.");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 28:
                Quest.setText(questions+". In the processing of unstructured data (images), blurring reduces the focus on unimportant features and thus, alleviates the importance/weightage of the key aspects of an image, it allows for the image to look smother.");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 29:
                Quest.setText(questions+". In the processing of unstructured data (images), blurring increases the focus on unimportant features and thus, alleviates the importance/weightage of the key aspects of an image, it allows for the image to look smother.");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 30:
                Quest.setText(questions+". In the processing of unstructured data (Text), Text data preprocessing can be done in multiple steps of syntactic changes depending on the need of the ML model. For example, removing numerals, conversion of uppercase to lowercase, removing punctuations, white spaces, removing stop words, perform stemming/lemmatization, etc. ");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 31:
                Quest.setText(questions+". In the processing of unstructured data (Text), Text data preprocessing can be done in only one step of syntactic changes depending on the need of the ML model. For example, removing numerals, conversion of uppercase to lowercase, removing punctuations, white spaces, removing stop words, perform stemming/lemmatization, etc. ");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 32:
                Quest.setText(questions+". In the processing of unstructured data (Text), is the process of reducing words to their stem, base or root form by removing prefixes and suffixes.");
                a.setText("A) Data filtering");
                b.setText("B) Lemmatization");
                c.setText("C) Stemming");
                d.setText("D) Data imputation");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 33:
                Quest.setText(questions+". In the processing of unstructured data (Text), uses lexical knowledge bases to get the correct base forms of words.");
                a.setText("A) Data filtering");
                b.setText("B) Lemmatization");
                c.setText("C) Stemming");
                d.setText("D) Data imputation");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 34:
                Quest.setText(questions+". When data is collected from the field may have null or missing values requiring replacing null values with some appropriate values, this is:");
                a.setText("A) Data filtering");
                b.setText("B) Lemmatization");
                c.setText("C) Stemming");
                d.setText("D) Data imputation");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 35:
                Quest.setText(questions+". When data is collected from the field and have null or missing values this can be imputed with measures of central tendency (mean, median or mode), K- Nearest-Neighbor [DI1] method, or a regression-based approach.");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 36:
                Quest.setText(questions+". When data is collected from the field and have null or missing values this can’t be imputed with measures of central tendency (mean, median or mode), K- Nearest-Neighbor [DI1] method, or a regression-based approach.");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 37:
                Quest.setText(questions+". Which are some the different approaches in Data Imputation?");
                a.setText("A) Imputation by Measures of Central Tendency, Imputation by Mean of Column");
                b.setText("B) Imputation by Median of Column, Imputation by Mode of Columns, Hot Deck Approach");
                c.setText("C) Nearest Neighbor Methods, KNN Based Imputation, Regression Based Approach");
                d.setText("D) All of the above");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 38:
                Quest.setText(questions+". In the Imputation Approach Selection, Mode is used for discrete/ordinal/categorical values based column. E.g. for ‘Outlet_Size’ column as it has ordinal/categorical values like Small, Medium, High.");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 39:
                Quest.setText(questions+". In the Imputation Approach Selection, Mode is not used for discrete/ordinal/categorical values based column. E.g. for ‘Outlet_Size’ column as it has ordinal/categorical values like Small, Medium, High.");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 40:
                Quest.setText(questions+". In the Imputation Approach Selection, Mean is used for continuous values based column. E.g. for ‘Item_Weight’ column as it has continuous data values.");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 41:
                Quest.setText(questions+". In the Imputation Approach Selection, Mean is not used for continuous values based column. E.g. for ‘Item_Weight’ column as it has continuous data values.");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 42:
                Quest.setText(questions+". In the Imputation Approach Selection, KNN is used for data that are continuous, discrete, ordinal, and categorical (i.e., all kinds of missing data). And it is preferred over mean / mode when the data value range is high, i.e. (max – min) is high.");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 43:
                Quest.setText(questions+". In the Imputation Approach Selection, KNN is not used for data that are continuous, discrete, ordinal, and categorical (i.e., all kinds of missing data). And it is preferred over mean / mode when the data value range is high, i.e. (max – min) is high.");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 44:
                Quest.setText(questions+". This helps understanding the data structure and the relationship among its attributes, which is not possible by merely looking at the numbers or text provided.");
                a.setText("A) Data filtering");
                b.setText("B) Data visualization");
                c.setText("C) Data manipulation");
                d.setText("D) Data imputation");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 45:
                Quest.setText(questions+". These are the most commonly used visualization methods:");
                a.setText("A) Line plots for continuous values");
                b.setText("B) Box plots, Bar charts, Pie charts");
                c.setText("C) Histograms for discrete values ");
                d.setText("D) All of the above");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 46:
                Quest.setText(questions+". These are the types of plots:");
                a.setText("A) Univariate, Bivariate, Trivariate");
                b.setText("B) Univariate, Trivariate, Multivariate ");
                c.setText("C) Univariate, Bivariate, Multivariate");
                d.setText("D) All of the above");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 47:
                Quest.setText(questions+". Is the type of plot where the simplest form of analysis, in which the data being analyzed is a single variable:");
                a.setText("A) Univariate");
                b.setText("B) Bivariate");
                c.setText("C) Multivariate");
                d.setText("D) None of the above");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 48:
                Quest.setText(questions+". Is the type of plot where the analysis is carried out to find the relationship between two variables in the given data set:");
                a.setText("A) Univariate");
                b.setText("B) Bivariate");
                c.setText("C) Multivariate");
                d.setText("D) None of the above");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 49:
                Quest.setText(questions+". Is the type of plot for the analysis of three or more variables. Mesh plots and 3D are som of the ways one can visualize this data and discover relationships among them:");
                a.setText("A) Univariate");
                b.setText("B) Bivariate");
                c.setText("C) Multivariate");
                d.setText("D) None of the above");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 50:
                Quest.setText(questions+". Observations which do not follow the expected pattern for a given data set fall into this category, for example, fraud detection or hack attacks. If they are not frequent and do not contribute in the critical events, then they can be removed. But in practice, they should be thoroughly investigated before pruning them from the dataset.");
                a.setText("A) Line plots for continuous values");
                b.setText("B) Box plots");
                c.setText("C) Histograms for discrete values ");
                d.setText("D) Anomaly/Outlier Detection");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 51:
                Quest.setText(questions+". Error: Outliers in this case are outcomes of an error in the measurement, data entry and sampling, e.g. the temperature data recorded in Celsius for most records but for a few others, in Fahrenheit, by mistake.");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 52:
                Quest.setText(questions+". Natural: Outliers in this case are outcomes of an error in the measurement, data entry and sampling, e.g. the temperature data recorded in Celsius for most records but for a few others, in Fahrenheit, by mistake.");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 53:
                Quest.setText(questions+". Natural: Some outliers can occur in a natural situation, e.g., if a flood incident occurs once in 100 years.");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 54:
                Quest.setText(questions+". Intentional: Some outliers can occur in a natural situation, e.g., if a flood incident occurs once in 100 years.");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 55:
                Quest.setText(questions+". Intentional: Dummy outliers made to validate detection methods, e.g., lab-grown artificial record used for testing corner scenarios.");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 56:
                Quest.setText(questions+". Intentional: Dummy outliers made to validate detection methods, e.g., lab-grown artificial record used for testing corner scenarios.");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 57:
                Quest.setText(questions+". While computing various statistics with the given data set, often it is helpful to make use of a visual box-plot to see the data distribution. Box-plots help determine the outlier position of the given data set. The ends of the box are the upper and lower quartiles. The whiskers are the two lines outside the box that extend to the highest and lowest data thresholds beyond which datapoints are considered to be outliers.");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 58:
                Quest.setText(questions+". While computing various statistics with the given data set, it is not helpful to make use of a visual box-plot to see the data distribution. Box-plots help determine the outlier position of the given data set. The ends of the box are the upper and lower quartiles. The whiskers are the two lines outside the box that extend to the highest and lowest data thresholds beyond which datapoints are considered to be outliers.");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 59:
                Quest.setText(questions+". ML problems often have large numbers of input features but not all of them contribute to the classification or regression output. The higher the number of features, the harder it is to visualize the training set. The technique of reducing the number of variables under consideration is called:");
                a.setText("A) Data filtering");
                b.setText("B) Data manipulation");
                c.setText("C) Discrete values values ");
                d.setText("D) Dimensionality reduction");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 60:
                Quest.setText(questions+". Is the method of Dimensionality Reduction, where the elimination is done removing columns that are not contributing to the output variable, using Univariate analysis or Too low-density data");
                a.setText("A) Bivariate analysis");
                b.setText("B) Principal component analysis");
                c.setText("C) Irrelevant feature  elimination");
                d.setText("D) Dimensionality reduction");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 61:
                Quest.setText(questions+". Is the method of Dimensionality Reduction, where the elimination is done removing the columns whose value does not change across rows. For instance, consider the sales transaction data from a single retail store, then columns such as store name, store location would not change across rows and should be removed. ");
                a.setText("A) Bivariate analysis");
                b.setText("B) Principal component analysis");
                c.setText("C) Irrelevant feature  elimination");
                d.setText("D) Univariate analysis");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 62:
                Quest.setText(questions+". Is the method of Dimensionality Reduction, where the data can easily be dropped after investigation to save space. For example, database row ID based columns have a unique value for every row and should be removed.");
                a.setText("A) Bivariate analysis");
                b.setText("B) Too low density data");
                c.setText("C) Irrelevant feature  elimination");
                d.setText("D) Univariate analysis");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 63:
                Quest.setText(questions+". Is the method of Dimensionality Reduction, that removes one among the pair of highly correlated input attributes (thus, it is also known as correlation analysis), for instance, in a store inventory data, 'item price' and 'item quantity' are highly correlated attributes.");
                a.setText("A) Bivariate analysis");
                b.setText("B) Too low density data");
                c.setText("C) Irrelevant feature  elimination");
                d.setText("D) Univariate analysis");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 64:
                Quest.setText(questions+". Is the method of Dimensionality Reduction, that reduces the dimensions of larger datasets extensively, yet preserves the information to the maximum. It deduces a new set of independent variables (called principal components) and puts them in order of reducing significance. The required number of top principal components (thus, reduced number of variables or dimensions) can then be selected still preserving the maximum possible information of the original dataset. ");
                a.setText("A) Bivariate analysis");
                b.setText("B) Too low density data");
                c.setText("C) Principal component analysis");
                d.setText("D) Univariate analysis");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 65:
                Quest.setText(questions+". Are the evaluation parameters for a trained model and can be seen as the measurement of how far the trained model delivers accurate and reliable results. For a given type of algorithm, they can be used to compare trained models with each other ");
                a.setText("A) Supervised Regression");
                b.setText("B) Metrics");
                c.setText("C) Unsupervised Clustering");
                d.setText("D) Univariate analysis");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 66:
                Quest.setText(questions+". Metrics offer an objective means to verify model effectiveness using test datasets.");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 67:
                Quest.setText(questions+". Metrics doesn’t help to verify model effectiveness using test datasets.");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 68:
                Quest.setText(questions+". Choosing appropriate metrics is a key to verification. The wrong metrics selection can result in the deployment of an unsuitable model.");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 69:
                Quest.setText(questions+". Choosing wrong metrics is a key to verification. The wrong metrics selection can result in the deployment of an unsuitable model.");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 70:
                Quest.setText(questions+". Each Machine Learning model is trying to solve a problem with a different objective, using a different dataset and hence, it is important to understand the context before choosing a metric.");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 71:
                Quest.setText(questions+". Each Machine Learning model is trying to solve the same problem with the same objective, using a different dataset and hence, it is important to understand the context before choosing a metric.");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 72:
                Quest.setText(questions+". The responsibility of selecting appropriate metrics today lies with the developers, however, the roles of dev and test are evolving in AI. Testers with appropriate knowledge are likely to be involved at this stage.");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 73:
                Quest.setText(questions+". The responsibility of selecting appropriate metrics today lies with the project owner, however, the roles of dev and test are evolving in AI. Testers with appropriate knowledge are likely to be involved at this stage.");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 74:
                Quest.setText(questions+". Inertia, Adjusted Rand score are metrics used in:");
                a.setText("A) Supervised Classification");
                b.setText("B) Supervised Regression");
                c.setText("C) Unsupervised Clustering");
                d.setText("D) Unsupervised Association");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 75:
                Quest.setText(questions+". Support, Confidence, Lift are metrics used in:");
                a.setText("A) Supervised Classification");
                b.setText("B) Supervised Regression");
                c.setText("C) Unsupervised Clustering");
                d.setText("D) Unsupervised Association");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 76:
                Quest.setText(questions+". Accuracy, Precision, Recall/Sensitivity, Specificity, F1-score are metrics used in:");
                a.setText("A) Supervised Classification");
                b.setText("B) Supervised Regression");
                c.setText("C) Unsupervised Clustering");
                d.setText("D) Unsupervised Association");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 77:
                Quest.setText(questions+". Root-mean-square-error (RMSE), R-square error are metrics used in:");
                a.setText("A) Supervised Classification");
                b.setText("B) Supervised Regression");
                c.setText("C) Unsupervised Clustering");
                d.setText("D) Unsupervised Association");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 78:
                Quest.setText(questions+". For an unsupervised clustering-based model, this metric is the average spread of a cluster across all the discovered clusters:");
                a.setText("A) Adjusted Rand");
                b.setText("B) Inertia o WCSS");
                c.setText("C) Support");
                d.setText("D) Confidence");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 79:
                Quest.setText(questions+". The smaller Inertia value means better clustering, as it means that the data points within a cluster are closer to each other. The cluster size (and thus, the value of Inertia) will go down naturally as the number of clusters goes up. However, Inertia stops decreasing significantly beyond a certain number of clusters; this point shows the optimum value for Inertia and the number of clusters for a given dataset – this method is known as the elbow method.");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 80:
                Quest.setText(questions+". The smaller Inertia value means better clustering, as it means that the data points within a cluster are closer to each other. The cluster size (and thus, the value of Inertia) will go down naturally as the number of clusters goes up. However, Inertia stops decreasing significantly beyond a certain number of clusters; this point shows the optimum value for Inertia and the number of clusters for a given dataset – this method is known as the leg method.");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 81:
                Quest.setText(questions+". When the actual values of the labels are available for every data point, this metric is preferred over Inertia. It is a measure of similarity between the cluster assignments (by the model) and the actual separate classes.");
                a.setText("A) Adjusted Rand");
                b.setText("B) Inertia o WCSS");
                c.setText("C) Support");
                d.setText("D) Confidence");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 82:
                Quest.setText(questions+". This metric is used for an itemset measures how frequently it is appearing in transactions. For example, if the item ‘bread’ is present in 7 out of 10 total transactions at a retail store, its support is 70%. ");
                a.setText("A) Adjusted Rand");
                b.setText("B) Lift");
                c.setText("C) Support");
                d.setText("D) Confidence");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 83:
                Quest.setText(questions+". This metric is used to eliminate scenarios where two itemset are occurring together very frequently (thus, the confidence metric value will be high). However, the two itemset may not have any interdependency. Besides, this metric can reveal if more occurrence of itemset X means more or less occurrence of itemset Y (i.e., positive or negative association between X and Y).");
                a.setText("A) Adjusted Rand");
                b.setText("B) Lift");
                c.setText("C) Support");
                d.setText("D) Confidence");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 84:
                Quest.setText(questions+". Supervised classification metrics are computed using a confusion matrix made- up of the counts of true positives, false positives, true negatives, false negatives.");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 85:
                Quest.setText(questions+". Support classification metrics are computed using a confusion matrix made- up of the counts of true positives, false positives, true negatives, false negatives.");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 86:
                Quest.setText(questions+". This metric in a model shows what percentage or fraction of total classifications were done accurately by the trained model on a test dataset. This metric becomes a poor choice of metric if one class of data dominates over the others.");
                a.setText("A) Adjusted Rand");
                b.setText("B) Precision");
                c.setText("C) Recall");
                d.setText("D) Accuracy");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 87:
                Quest.setText(questions+". This metric measures how accurately the model classifies true positives.");
                a.setText("A) Adjusted Rand");
                b.setText("B) Precision");
                c.setText("C) Recall");
                d.setText("D) Accuracy");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 88:
                Quest.setText(questions+". This metric measures how far the model failed or missed to detect the positives.");
                a.setText("A) Adjusted Rand");
                b.setText("B) Precision");
                c.setText("C) Recall");
                d.setText("D) Accuracy");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 89:
                Quest.setText(questions+". Like precision but opposite to recall, this metric measures how accurately the model classifies true negatives. .");
                a.setText("A) Specificity");
                b.setText("B) Precision");
                c.setText("C) Recall");
                d.setText("D) F1-score");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 90:
                Quest.setText(questions+". This metric is computed as the harmonic mean of precision and recall. A low value of this metric represents the poor quality of the model at detecting positives. This metric will have a value between 0 and 1. Close to 1 means that there is good quality and no false data disturbing the result.");
                a.setText("A) Specificity");
                b.setText("B) Precision");
                c.setText("C) Recall");
                d.setText("D) F1-score");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 91:
                Quest.setText(questions+". The supervised regression model metrics represent how well the regression line fits the actual data points. ");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 92:
                Quest.setText(questions+". The clustering regression model metrics represent how well the regression line fits the actual data points. ");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 93:
                Quest.setText(questions+". This metric is a measure of how far the data points are from the regression line. It is measured as the standard deviation of prediction errors. The value of this metric changes if the same dataset is measured in a different unit.");
                a.setText("A) RMSE");
                b.setText("B) Precision");
                c.setText("C) R-square");
                d.setText("D) F1-score");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 94:
                Quest.setText(questions+". This metric is a measure of how better the predictions by the regression line are compared to using mean as a predictor. Its value ranges from 0 to 1 and is independent of the unit used to measure data points.");
                a.setText("A) RMSE");
                b.setText("B) Precision");
                c.setText("C) R-square");
                d.setText("D) F1-score");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 95:
                Quest.setText(questions+". The metrics values depend on how the datapoints for training and validation are chosen. Thus, it becomes the key aspect for model evaluation that datapoints for training and validation are selected in a completely unbiased way.");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 96:
                Quest.setText(questions+". The metrics values don’t depend on how the datapoints for training and validation are chosen. Thus, it becomes the key aspect for model evaluation that datapoints for training and validation are selected in a completely unbiased way.");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 97:
                Quest.setText(questions+". Post training, an ML model is validated by computing model metrics against a validation dataset (different from its training dataset).");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 98:
                Quest.setText(questions+". Before training, an ML model is validated by computing model metrics against a validation dataset (different from its training dataset).");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 99:
                Quest.setText(questions+". The dataset for training, validation and testing phases must come from the same or similar source(s) to ensure the effectiveness of metrics.");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 100:
                Quest.setText(questions+". The dataset for training, validation and testing phases must come from different source(s) to ensure the effectiveness of metrics.");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 101:
                Quest.setText(questions+". A model trained using one kind of dataset may perform very poorly on a dataset originated from very different source(s).");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 102:
                Quest.setText(questions+". A model trained using one kind of dataset may perform very efficient on a dataset originated from very different source(s).");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 103:
                Quest.setText(questions+". In order to rule out anomalies due to different data sources, one can split the available dataset on three brackets: Training set, Validation set and Test set.");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 104:
                Quest.setText(questions+". In order to rule out anomalies due to different data sources, one can split the available dataset on only one brackets: Training set.");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 105:
                Quest.setText(questions+". This dataset contains the data that the model is trained on.");
                a.setText("A) Training dataset");
                b.setText("B) Validation dataset");
                c.setText("C) Testing dataset");
                d.setText("D) All of the above ");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 106:
                Quest.setText(questions+". This dataset is used by the machine learning algorithm to evaluate if the training was effective.");
                a.setText("A) Training dataset");
                b.setText("B) Validation dataset");
                c.setText("C) Testing dataset");
                d.setText("D) All of the above ");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 107:
                Quest.setText(questions+". This dataset is a separate dataset that is used after the ML process is finished to validate whether the algorithm has been adequately trained. This dataset should not be used during the training process.");
                a.setText("A) Training dataset");
                b.setText("B) Validation dataset");
                c.setText("C) Testing dataset");
                d.setText("D) All of the above ");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 108:
                Quest.setText(questions+". In every run of ML (which is a process of many iterations), the training dataset and validation dataset are combined again and split in a different way so that the algorithm uses different combinations of data to learn from.");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 109:
                Quest.setText(questions+". In every test of ML (which is a process of many iterations), the training dataset and validation dataset are combined again and split in a different way so that the algorithm uses different combinations of data to learn from.");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 110:
                Quest.setText(questions+". In the post-training phase, an ML model is evaluated and tested with a dataset different from its training dataset. However, the dataset for training, validation and testing phases must come from the same or similar source(s) to ensure the effectiveness of metrics. A model trained using one kind of dataset may perform very poorly on a dataset originated from very different source(s).");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 111:
                Quest.setText(questions+". In the pre-training phase, an ML model is evaluated and tested with a dataset different from its training dataset. However, the dataset for training, validation and testing phases must come from the same or similar source(s) to ensure the effectiveness of metrics. A model trained using one kind of dataset may perform very poorly on a dataset originated from very different source(s).");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 112:
                Quest.setText(questions+". If a supervised ML model is too simplistic to fit the training data points (i.e., it fails to represent the data trend) it is an example of:");
                a.setText("A) Overfitting");
                b.setText("B) Underfitting");
                c.setText("C) Bias-variance trade off");
                d.setText("D) All of the above ");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 113:
                Quest.setText(questions+". This model tries to fit the training data points too much and this often results in poor prediction accuracy during the subsequent validation or testing phases:");
                a.setText("A) Overfitting");
                b.setText("B) Underfitting");
                c.setText("C) Bias-variance trade off");
                d.setText("D) All of the above ");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 114:
                Quest.setText(questions+". The underfitting and overfitting nature of a model can also be explained in terms of Bias and variance errors. If a model is oversimplified and does not learn from all the provided features to represent, it is said to have high-bias and suffers from poor prediction accuracy.");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 115:
                Quest.setText(questions+". The underfitting and Bias-variance trade off nature of a model can also be explained in terms of Bias and variance errors. If a model is oversimplified and does not learn from all the provided features to represent, it is said to have high-bias and suffers from poor prediction accuracy.");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 116:
                Quest.setText(questions+". If the model prediction performance varies highly by changing the training dataset slightly, it is said to be a model of high variance (too dependent on the training dataset). A good model has to achieve low bias and low variance. This is known as:");
                a.setText("A) Overfitting");
                b.setText("B) Underfitting");
                c.setText("C) Bias-variance trade off");
                d.setText("D) All of the above ");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 117:
                Quest.setText(questions+". This is a Bias or Variance trade-off commonly used technique:");
                a.setText("A) Bootstrap");
                b.setText("B) K-fold Cross Validation");
                c.setText("C) Leave-one-out Cross Validation");
                d.setText("D) All of the above");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 118:
                Quest.setText(questions+". The way the available dataset is split into training and validation datasets may lead to high bias or high variance. In order to overcome this, multiple split combinations must be tried out before concluding model metrics.");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 119:
                Quest.setText(questions+". The way the available dataset is split into training and validation datasets may lead to low bias or high variance. In order to overcome this, multiple split combinations must be tried out before concluding model metrics.");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 120:
                Quest.setText(questions+". Some useful methods are split-test, bootstrap, K-fold cross-validation and leave-one-out cross-validation. Each of these methods repeats the training and validation process several times and the model performance is averaged out across all runs.");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 121:
                Quest.setText(questions+". Some useful methods are split-test, bootstrap, K-fold cross-validation and leave-one-out cross-validation. Each of these methods repeats the training and validation only one time and the model performance is averaged out across this run.");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 122:
                Quest.setText(questions+". This method divides the data into parts for training and testing datasets but in each iteration in different ratios. This helps revealing how different splits can produce different results.");
                a.setText("A) Split-test");
                b.setText("B) K-fold Cross Validation");
                c.setText("C) Boostrap");
                d.setText("D) Leave-one-out cross-validation");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 123:
                Quest.setText(questions+". This method divides the whole dataset into k-folds. Keep one subset for validation and use rest (k-1) subsets for training the model. Repeat this process k-times, by taking a different subset for validation in each iteration.");
                a.setText("A) Split-test");
                b.setText("B) K-fold Cross Validation");
                c.setText("C) Bootstrap");
                d.setText("D) Leave-one-out cross-validation ");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 124:
                Quest.setText(questions+". This method is similar to K-fold cross-validation, only one data point from the dataset is left out for validation and the rest is used for training, there is lees bias as the whole dataset is used for training, so it requires more execution time.");
                a.setText("A) Split-test");
                b.setText("B) K-fold Cross Validation");
                c.setText("C) Bootstrap");
                d.setText("D) Leave-one-out cross-validation ");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 125:
                Quest.setText(questions+". This is one of the primary tasks when it comes to understanding the available dataset. It  can be done at four levels and each subsequent level is a natural extension to the previous level ");
                a.setText("A) Split-test");
                b.setText("B) Filtering");
                c.setText("C) Bootstrap");
                d.setText("D) Analysis");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 126:
                Quest.setText(questions+". This type of analytics is about deducing the statistical summary of data in terms of measures for central tendency (mean, median, mode) as well as measures for dispersion (variance, standard deviation). This helps getting insight about the past and answer: “What has happened?”");
                a.setText("A) Descriptive analytics");
                b.setText("B) Exploratory analytics");
                c.setText("C) Predictive analytics");
                d.setText("D) Prescriptive analytics");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 127:
                Quest.setText(questions+". This type of analytics is about visualizing the dataset at a high level to see its patterns and variations. ");
                a.setText("A) Descriptive analytics");
                b.setText("B) Exploratory analytics");
                c.setText("C) Predictive analytics");
                d.setText("D) Prescriptive analytics");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 128:
                Quest.setText(questions+". This type of analytics is modeling the input variables and predicting the probability of outcomes.");
                a.setText("A) Descriptive analytics");
                b.setText("B) Exploratory analytics");
                c.setText("C) Predictive analytics");
                d.setText("D) Prescriptive analytics");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 129:
                Quest.setText(questions+". This type of analytics is comparing all viable predictions resulting from predictive analytics and choosing/prescribing the best among them.");
                a.setText("A) Descriptive analytics");
                b.setText("B) Exploratory analytics");
                c.setText("C) Predictive analytics");
                d.setText("D) Prescriptive analytics");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
        }
    }
}
