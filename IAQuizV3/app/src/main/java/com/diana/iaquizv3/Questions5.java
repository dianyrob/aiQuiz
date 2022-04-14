package com.diana.iaquizv3;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Questions5 {
    public String fillQuestion(TextView Quest, Button a, Button b, Button c, Button d, int questions, int question){
        String correct = null;
        switch (question){
            case 1:
                Quest.setText("Once an ML model is trained, it should work with a defined level of accuracy and for all the defined variations of scenarios.");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                correct = "a";
                break;
            case 2:
                Quest.setText("Before an ML model is trained, it should work with a defined level of accuracy and for all the defined variations of scenarios.");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                correct = "b";
                break;
            case 3:
                Quest.setText("Once an ML model is trained, if the quality of the predictions by the model is insufficient for some scenarios and work fantastically for others, it is likely to be a biased model. A dataset for which the model quality goes below the defined level of quality represents a defect.");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                correct = "a";
                break;
            case 4:
                Quest.setText("Once an ML model is trained, if the quality of the predictions by the model is insufficient for some scenarios and work fantastically for others, it is likely to be a biased model. A dataset for which the model quality goes below the defined level of quality represents a success.");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                correct = "b";
                break;
            case 5:
                Quest.setText("As a tester, it is very difficult to discover all such defects without using a systematic approach.");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                correct = "a";
                break;
            case 6:
                Quest.setText("As a tester, it is very easy to discover all such defects without using a systematic approach.");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                correct = "b";
                break;
            case 7:
                Quest.setText("One needs to examine the behavior of the model and its variation with change in input factors to deduce an approximation of the relationship between input and output. This kind of deduction is called interpreting or explaining the ML model.");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                correct = "a";
                break;
            case 8:
                Quest.setText("One needs to examine the behavior of the model and its variation with change in input factors to deduce an approximation of the relationship between input and output. This kind of deduction is called intercepting or blocking the ML model.");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                correct = "b";
                break;
            case 9:
                Quest.setText("An insight into the model behavior helps evaluating its overall quality and the model’s viability for deployment.");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                correct = "a";
                break;
            case 10:
                Quest.setText("An insight into the model behavior helps evaluating its overall quality and the model’s viability for testing.");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                correct = "b";
                break;
            case 11:
                Quest.setText("Other reasons for requiring explaining or interpreting models can be safety measures, social acceptance, detecting bias, or human curiosity and learning about the model. ");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                correct = "a";
                break;
            case 12:
                Quest.setText("Other reasons for requiring explaining or blocking models can be safety measures, social acceptance, detecting bias, or human curiosity and learning about the model. ");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                correct = "b";
                break;
            case 13:
                Quest.setText("Not all models can be explained. The more complex the model, the less likely it is to interpret or explain it. ");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                correct = "a";
                break;
            case 14:
                Quest.setText("All models can be explained. The more complex the model, the less likely it is to interpret or explain it. ");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                correct = "b";
                break;
            case 15:
                Quest.setText("The output of non-DL models, e.g. random forest, decision trees, linear regression, etc., can conveniently be explained in terms of the input variables. ");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                correct = "a";
                break;
            case 16:
                Quest.setText("The output of non-DL models, e.g. random forest, decision trees, linear regression, etc., can not be explained in terms of the input variables. ");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                correct = "b";
                break;
            case 17:
                Quest.setText("The DL models are inherently complex in their implementation, so it is better to examine the model as a black-box, i.e. observe the variations of outcomes by small perturbations of the input variables and approximate the underlying model by a simple, interpretable model. ");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                correct = "a";
                break;
            case 18:
                Quest.setText("The DL models are very easy in their implementation, so it is better to examine the model as a black-box, i.e. observe the variations of outcomes by small perturbations of the input variables and approximate the underlying model by a simple, interpretable model. ");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                correct = "b";
                break;
            case 19:
                Quest.setText("Some of the popular and easy-to-use algorithms, tools and approaches for model interpretation include: Local Interpretable Model-agnostic Explanations (LIME) and Class Activation Maps (CAM).");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                correct = "a";
                break;
            case 20:
                Quest.setText("Some of the popular and easy-to-use algorithms, tools and approaches for model interpretation include: Local Acceptable Model-agnostic Explanations (LAME) and Class Motivation Maps (CMM).");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                correct = "b";
                break;
            case 21:
                Quest.setText("One of the most important things of the ML models is understand all the rationale behind the predictions that could be made of it and make the right questions to ensure we are covering most of the predictions");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                correct = "a";
                break;
            case 22:
                Quest.setText("One of the less important things of the ML models is understand all the rationale behind the predictions that could be made of it and make the right questions to ensure we are covering most of the predictions");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                correct = "b";
                break;
            case 23:
                Quest.setText("Is one of the self-explainable algorithms used in AI");
                a.setText("A) Decision trees");
                b.setText("B) Linear Regression ");
                c.setText("C) Random Forest (using Feature Importance) ");
                d.setText("D)All of the above");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                correct = "d";
                break;
            case 24:
                Quest.setText("Is one of the external tools used in AI to explain the model");
                a.setText("A) LIME (Local Interpretable Model Explanations");
                b.setText("B) Decision trees");
                c.setText("C) Linear Regression");
                d.setText("D)All of the above");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                correct = "a";
                break;
            case 25:
                Quest.setText("Is one of the external tools used in AI to explain the model");
                a.setText("A) Decision trees ");
                b.setText("B) Counterfactuals ");
                c.setText("C) Linear Regression ");
                d.setText("D)All of the above");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                correct = "b";
                break;
            case 26:
                Quest.setText("Is one of the external tools used in AI to explain the model");
                a.setText("A) Decision trees ");
                b.setText("B) Linear Regression ");
                c.setText("C) Activation Maps");
                d.setText("D)All of the above");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                correct = "c";
                break;
            case 27:
                Quest.setText("These are intuitive and unexpected results are easy to identify.");
                a.setText("A) Decision trees");
                b.setText("B) Linear Regression");
                c.setText("C) Random Forest (using Feature Importance) ");
                d.setText("D)All of the above");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                correct = "a";
                break;
            case 28:
                Quest.setText("It is fed a sample to study model predictions for the sample and its closer variations and it reveals the input features responsible for the model predicted output ");
                a.setText("A) LIME (Local Interpretable Model Explanations");
                b.setText("B) Decision trees");
                c.setText("C) Linear Regression");
                d.setText("D)All of the above");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                correct = "a";
                break;
            case 29:
                Quest.setText("LIME generates enough close variants of the sample input and gets outcome for each of the variants. Thus, it attempts to approximate how small variations in input are changing the output variable. Since all variants generated and studied by LIME are in close vicinity of the given sample, LIME explanations are called ‘local’ (to the sample input).");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                correct = "a";
                break;
            case 30:
                Quest.setText("LIME doesn’t generate enough close variants of the sample input and gets outcome for each of the variants. Thus, it attempts to approximate how small variations in input are changing the output variable. Since all variants generated and studied by LIME are in close vicinity of the given sample, LIME explanations are called ‘local’ (to the sample input).");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                correct = "b";
                break;
            case 31:
                Quest.setText("LIME can be used on an image classifier to generate explanations. It deduces image portions that play a significant role in determining the outcome. It allows a tester to relate as well as to rule out that the model is not basing its deductions on irrelevant features.");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                correct = "a";
                break;
            case 32:
                Quest.setText("LIME can not be used on an image classifier to generate explanations. It deduces image portions that play a significant role in determining the outcome. It allows a tester to relate as well as to rule out that the model is not basing its deductions on irrelevant features.");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                correct = "b";
                break;
            case 33:
                Quest.setText("For a text classifier, LIME can point out the words (text portions) that lead to the categorization of the sample text into one of the predefined classes. This helps a tester to assess whether the model is basing its deductions on irrelevant words.");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                correct = "a";
                break;
            case 34:
                Quest.setText("For a text classifier, LIME can not point out the words (text portions) that lead to the categorization of the sample text into one of the predefined classes. This helps a tester to assess whether the model is basing its deductions on irrelevant words.");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                correct = "b";
                break;
            case 35:
                Quest.setText("Gradient- based Class Activation Mapping (Grad-CAM) visualizes the input regions that are important for predictions from these models. It uses the class-specific gradient information flowing into the final convolutional layer of a CNN and produces a coarse localization map of the important regions in the image.");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                correct = "a";
                break;
            case 36:
                Quest.setText("Gradient- based Class Activation Mapping (Grad-CAM) visualizes the output regions that are important for predictions from these models. It uses the class-specific gradient information flowing into the final convolutional layer of a CNN and produces a coarse localization map of the important regions in the image.");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                correct = "b";
                break;
            case 37:
                Quest.setText("It helps computate commonly-identified fairness metrics for binary and multiclass classifiers.");
                a.setText("A) Decision trees ");
                b.setText("B) Linear Regression ");
                c.setText("C) Fariness");
                d.setText("D)All of the above");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                correct = "c";
                break;
            case 38:
                Quest.setText("Prejudice in favor of against one thing, person, or group compared with another, usually in a way considered to be unfair. It’s also known as unfairness, is a measured of the distance");
                a.setText("A) Bias");
                b.setText("B) Linear Regression ");
                c.setText("C) Fariness");
                d.setText("D)All of the above");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                correct = "a";
                break;
        }
        return correct;
    }
}
