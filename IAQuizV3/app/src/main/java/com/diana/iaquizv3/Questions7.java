package com.diana.iaquizv3;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Questions7 {

    public void fillQuestion(TextView Quest, TextView qNum, Button a, Button b, Button c, Button d, int questions, int question){
        switch (question){
            case 1:
                qNum.setText(questions+".");
                Quest.setText("AI can assist and support various activities of the testing and development process such as:");
                a.setText("A) Test planning, creating tests and test data");
                b.setText("B) Impact analysis and selection of test for regression");
                c.setText("C) Test result analysis and defect prediction");
                d.setText("D) All of the above");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 2:
                qNum.setText(questions+".");
                Quest.setText("AI can assist and support various activities of the testing and development process such as:");
                a.setText("A) Predicting the component causing the bug");
                b.setText("B) Defect assignment");
                c.setText("C) Test automation");
                d.setText("D) All of the above");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 3:
                qNum.setText(questions+".");
                Quest.setText("AI can assist and support various activities of the testing and development process such as:");
                a.setText("A) Definition of requirements");
                b.setText("B) UX design");
                c.setText("C) User experience design");
                d.setText("D) None of the above");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 4:
                qNum.setText(questions+".");
                Quest.setText("Is the activity of the test planning where the AI can help doing estimation of resources and time needed for a project");
                a.setText("A) Test planning");
                b.setText("B) Test estimation");
                c.setText("C) Test execution");
                d.setText("D) Risk analysis");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 5:
                qNum.setText(questions+".");
                Quest.setText("Is the activity of the test planning where the AI can help with contribution factors, likelihood and impact");
                a.setText("A) Test planning");
                b.setText("B) Test estimation");
                c.setText("C) Test execution");
                d.setText("D) Risk analysis");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 6:
                qNum.setText(questions+".");
                Quest.setText("AI can help in the test planning to prioritize risks, obtain more accurate metrics associated with schedule adherence, and help identifying the performance metrics of applications more accurately");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 7:
                qNum.setText(questions+".");
                Quest.setText("AI can’t help in the test planning to prioritize risks, can’t obtain more accurate metrics associated with schedule adherence, and can’t help identifying the performance metrics of applications more accurately");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 8:
                qNum.setText(questions+".");
                Quest.setText("In the context of test planning and estimation, overall software project cost can be approximated, taking into account different inputs related to the AI projects, including data size, effort involved, platform choice, application type, data preparation time, training time, and testing time");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 9:
                qNum.setText(questions+".");
                Quest.setText("In the context of test planning and estimation, overall software project cost can be calculated in exact way, taking into account different inputs related to the AI projects, including data size, effort involved, platform choice, application type, data preparation time, training time, and testing time");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 10:
                qNum.setText(questions+".");
                Quest.setText("Having some historical data from different inputs, ML models can be prepared to give more accurate estimations ");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 11:
                Quest.setText("Without historical data from different inputs, ML models can be prepared to give more accurate estimations ");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 12:
                qNum.setText(questions+".");
                Quest.setText("What can help to determine: Factors contributing to the risk: Possible probabilities of the risk becoming a reality: Ability to meet the goals and milestones: Performance analysis of teams, individuals?");
                a.setText("A) Testing cycle");
                b.setText("B) Neuronal networks");
                c.setText("C) Artificial intelligence");
                d.setText("D) Risk Analysis");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 13:
                qNum.setText(questions+".");
                Quest.setText("Generating realistic test data is one of the critical problems in testing");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 14:
                qNum.setText(questions+".");
                Quest.setText("Generating realistic test data is one of the easy tasks in testing");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 15:
                qNum.setText(questions+".");
                Quest.setText("Production data anonymization/masking has its own challenges; Synthetic data may miss many nuances of real-world data; Image data is harder to produce, are:");
                a.setText("A) Ways to get data for AI testing");
                b.setText("B) Problems defining the requirements");
                c.setText("C) Way to generate data for AI testing");
                d.setText("D) Problems in AI testing");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 16:
                qNum.setText(questions+".");
                Quest.setText("For test design, using AI technologies, like natural language processing (NLP) and text mining, can help the automated test case generation from textual requirements documents ");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 17:
                qNum.setText(questions+".");
                Quest.setText("For test design, using AI technologies, like natural language processing (NLP) and text mining, doesn’t help the automated test case generation from textual requirements documents ");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 18:
                qNum.setText(questions+".");
                Quest.setText("AI applied on code analysis (both static and dynamic), along with the analysis of the data collected from tests, can flag potential issues of performance and other non-functional requirements ");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 19:
                qNum.setText(questions+".");
                Quest.setText("AI applied on code analysis (both static and dynamic), along with the analysis of the data collected from tests, is not useful to detect issues of performance and other non-functional requirements ");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 20:
                qNum.setText(questions+".");
                Quest.setText("Running ML on past data can help identifying test data patterns and helps generating automated test data for both component tests and system tests. ");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 21:
                qNum.setText(questions+".");
                Quest.setText("Running ML on past data doesn’t help identifying test data patterns and helps generating automated test data for both component tests and system tests. ");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 22:
                qNum.setText(questions+".");
                Quest.setText("For image data and GUI elements, AI can help identify incorrectly rendered elements automatically. Additionally, by an ML based data centric analysis of different possible flows, the right flows of data can be automated. ");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 23:
                qNum.setText(questions+".");
                Quest.setText("For image data and GUI elements, AI doesn’t help identify incorrectly rendered elements automatically. Additionally, by an ML based data centric analysis of different possible flows, the right flows of data can be automated. ");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 24:
                qNum.setText(questions+".");
                Quest.setText("Is done using the classification technique (e.g. Logistic Regression) to predict faults");
                a.setText("A) AI Machine Learning");
                b.setText("B) AI Defect Prediction");
                c.setText("C) AI-Based Machine Learning ");
                d.setText("D) AI-Based Defect Prediction ");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 25:
                qNum.setText(questions+".");
                Quest.setText("For automated defect prediction, models using ML can predict defect based on code quality metrics");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 26:
                qNum.setText(questions+".");
                Quest.setText("For automated defect prediction, models using ML can’t predict defect based on code quality metrics");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 27:
                qNum.setText(questions+".");
                Quest.setText("Impact analysis using ML on code can help automate the identification of impacted modules and files based on change");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 28:
                qNum.setText(questions+".");
                Quest.setText("Impact analysis using Augmented Reality on code can help automate the identification of impacted modules and files based on change");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 29:
                qNum.setText(questions+".");
                Quest.setText("In terms of coverage analysis using AI can help achieve comprehensive test and code coverage via the analysis of the data flows captured");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 30:
                qNum.setText(questions+".");
                Quest.setText("In terms of coverage analysis using AR can help achieve comprehensive test and code coverage via the analysis of the data flows captured ");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 31:
                qNum.setText(questions+".");
                Quest.setText("Dashboards can be made dynamic and smart by using AI");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 32:
                qNum.setText(questions+".");
                Quest.setText("Dashboards can’t be made dynamic and smart by using AI ");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 33:
                qNum.setText(questions+".");
                Quest.setText("Data driven ML algorithms extract intelligence by crunching input data and produce smart outputs");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 34:
                qNum.setText(questions+".");
                Quest.setText("Data driven ML algorithms extract intelligence by crunching input data but don’t produce smart outputs ");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 35:
                qNum.setText(questions+".");
                Quest.setText("Some of automation tools use AI for making automation easier or more maintainable.");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 36:
                qNum.setText(questions+".");
                Quest.setText("None of automation tools use AI for making automation easier or more maintainable.");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 37:
                qNum.setText(questions+".");
                Quest.setText("AI tools could use GUI Spiders which traverse the complete GUI and record the app. Over iterations, they are able to learn, compare and identify bugs");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 38:
                qNum.setText(questions+".");
                Quest.setText("AI tools could use GUI Spiders which traverse the complete GUI and record the app. Over iterations, they need something else to learn, compare and identify bugs");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 39:
                qNum.setText(questions+".");
                Quest.setText("This type of tool uses image processing technology instead of pixel comparison, can check various UI attributes such as color, positioning, size, etc., can find differences that are likely to be missed by testers.");
                a.setText("A) Visual, automated UI testing tools");
                b.setText("B) GUI Spiders tools");
                c.setText("C) API testing tools");
                d.setText("D) AI-Based Test Automation tools");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 40:
                qNum.setText(questions+".");
                Quest.setText("This type of tool uses ML and traverses the complete GUI and records the app, over iterations, it is able to learn, compare and identify bugs, may analyze GUI, DOM, performance, etc.");
                a.setText("A) Visual, automated UI testing tools");
                b.setText("B) GUI Spiders tools");
                c.setText("C) API testing tools");
                d.setText("D) AI-Based Test Automation tools");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 41:
                qNum.setText(questions+".");
                Quest.setText("This type of tool learn the APIs, the parameter variation and also sequences, etc., especially when there is no GUI to be tested.");
                a.setText("A) Visual, automated UI testing tools");
                b.setText("B) GUI Spiders tools");
                c.setText("C) API testing tools");
                d.setText("D) AI-Based Test Automation tools");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
        }
    }

}
