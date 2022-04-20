package com.diana.iaquizv3;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Questions7 {

    public String fillQuestion(TextView Quest, Button a, Button b, Button c, Button d, int questions, int question){
        String correct = null;
        switch (question){
            case 1:
                Quest.setText(questions+". AI can assist and support various activities of the testing and development process such as:");
                a.setText("A) Test planning, creating tests and test data");
                b.setText("B) Impact analysis and selection of test for regression");
                c.setText("C) Test result analysis and defect prediction");
                d.setText("D) All of the above");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                correct = "d";
                break;
            case 2:
                Quest.setText(questions+". AI can assist and support various activities of the testing and development process such as:");
                a.setText("A) Predicting the component causing the bug");
                b.setText("B) Defect assignment");
                c.setText("C) Test automation");
                d.setText("D) All of the above");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                correct = "d";
                break;
            case 3:
                Quest.setText(questions+". AI can assist and support various activities of the testing and development process such as:");
                a.setText("A) Definition of requirements");
                b.setText("B) UX design");
                c.setText("C) User experience design");
                d.setText("D) None of the above");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                correct = "d";
                break;
            case 4:
                Quest.setText(questions+". Is the activity of the test planning where the AI can help doing estimation of resources and time needed for a project");
                a.setText("A) Test planning");
                b.setText("B) Test estimation");
                c.setText("C) Test execution");
                d.setText("D) Risk analysis");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                correct = "b";
                break;
            case 5:
                Quest.setText(questions+". Is the activity of the test planning where the AI can help with contribution factors, likelihood and impact");
                a.setText("A) Test planning");
                b.setText("B) Test estimation");
                c.setText("C) Test execution");
                d.setText("D) Risk analysis");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                correct = "d";
                break;
            case 6:
                Quest.setText(questions+". AI can help in the test planning to prioritize risks, obtain more accurate metrics associated with schedule adherence, and help identifying the performance metrics of applications more accurately");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                correct = "a";
                break;
            case 7:
                Quest.setText(questions+". AI can’t help in the test planning to prioritize risks, can’t obtain more accurate metrics associated with schedule adherence, and can’t help identifying the performance metrics of applications more accurately");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                correct = "b";
                break;
            case 8:
                Quest.setText(questions+". In the context of test planning and estimation, overall software project cost can be approximated, taking into account different inputs related to the AI projects, including data size, effort involved, platform choice, application type, data preparation time, training time, and testing time");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                correct = "a";
                break;
            case 9:
                Quest.setText(questions+". In the context of test planning and estimation, overall software project cost can be calculated in exact way, taking into account different inputs related to the AI projects, including data size, effort involved, platform choice, application type, data preparation time, training time, and testing time");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                correct = "b";
                break;
            case 10:
                Quest.setText(questions+". Having some historical data from different inputs, ML models can be prepared to give more accurate estimations ");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                correct = "a";
                break;
            case 11:
                Quest.setText(questions+". Without historical data from different inputs, ML models can be prepared to give more accurate estimations ");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                correct = "b";
                break;
            case 12:
                Quest.setText(questions+". What can help to determine: Factors contributing to the risk: Possible probabilities of the risk becoming a reality: Ability to meet the goals and milestones: Performance analysis of teams, individuals?");
                a.setText("A) Testing cycle");
                b.setText("B) Neuronal networks");
                c.setText("C) Artificial intelligence");
                d.setText("D) Risk Analysis");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                correct = "c";
                break;
            case 13:
                Quest.setText(questions+". Generating realistic test data is one of the critical problems in testing");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                correct = "a";
                break;
            case 14:
                Quest.setText(questions+". Generating realistic test data is one of the easy tasks in testing");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                correct = "b";
                break;
            case 15:
                Quest.setText(questions+". Production data anonymization/masking has its own challenges; Synthetic data may miss many nuances of real-world data; Image data is harder to produce, are:");
                a.setText("A) Ways to get data for AI testing");
                b.setText("B) Problems defining the requirements");
                c.setText("C) Way to generate data for AI testing");
                d.setText("D) Problems in AI testing");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                correct = "d";
                break;
            case 16:
                Quest.setText(questions+". For test design, using AI technologies, like natural language processing (NLP) and text mining, can help the automated test case generation from textual requirements documents ");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                correct = "a";
                break;
            case 17:
                Quest.setText(questions+". For test design, using AI technologies, like natural language processing (NLP) and text mining, doesn’t help the automated test case generation from textual requirements documents ");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                correct = "b";
                break;
            case 18:
                Quest.setText(questions+". AI applied on code analysis (both static and dynamic), along with the analysis of the data collected from tests, can flag potential issues of performance and other non-functional requirements ");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                correct = "a";
                break;
            case 19:
                Quest.setText(questions+". AI applied on code analysis (both static and dynamic), along with the analysis of the data collected from tests, is not useful to detect issues of performance and other non-functional requirements ");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                correct = "b";
                break;
            case 20:
                Quest.setText(questions+". Running ML on past data can help identifying test data patterns and helps generating automated test data for both component tests and system tests. ");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                correct = "a";
                break;
            case 21:
                Quest.setText(questions+". Running ML on past data doesn’t help identifying test data patterns and helps generating automated test data for both component tests and system tests. ");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                correct = "b";
                break;
            case 22:
                Quest.setText(questions+". For image data and GUI elements, AI can help identify incorrectly rendered elements automatically. Additionally, by an ML based data centric analysis of different possible flows, the right flows of data can be automated. ");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                correct = "a";
                break;
            case 23:
                Quest.setText(questions+". For image data and GUI elements, AI doesn’t help identify incorrectly rendered elements automatically. Additionally, by an ML based data centric analysis of different possible flows, the right flows of data can be automated. ");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                correct = "b";
                break;
            case 24:
                Quest.setText(questions+". Is done using the classification technique (e.g. Logistic Regression) to predict faults");
                a.setText("A) AI Machine Learning");
                b.setText("B) AI Defect Prediction");
                c.setText("C) AI-Based Machine Learning ");
                d.setText("D) AI-Based Defect Prediction ");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                correct = "d";
                break;
            case 25:
                Quest.setText(questions+". For automated defect prediction, models using ML can predict defect based on code quality metrics");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                correct = "a";
                break;
            case 26:
                Quest.setText(questions+". For automated defect prediction, models using ML can’t predict defect based on code quality metrics");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                correct = "b";
                break;
            case 27:
                Quest.setText(questions+". Impact analysis using ML on code can help automate the identification of impacted modules and files based on change");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                correct = "a";
                break;
            case 28:
                Quest.setText(questions+". Impact analysis using Augmented Reality on code can help automate the identification of impacted modules and files based on change");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                correct = "b";
                break;
            case 29:
                Quest.setText(questions+". In terms of coverage analysis using AI can help achieve comprehensive test and code coverage via the analysis of the data flows captured");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                correct = "a";
                break;
            case 30:
                Quest.setText(questions+". In terms of coverage analysis using AR can help achieve comprehensive test and code coverage via the analysis of the data flows captured ");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                correct = "b";
                break;
            case 31:
                Quest.setText(questions+". Dashboards can be made dynamic and smart by using AI");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                correct = "a";
                break;
            case 32:
                Quest.setText(questions+". Dashboards can’t be made dynamic and smart by using AI ");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                correct = "b";
                break;
            case 33:
                Quest.setText(questions+". Data driven ML algorithms extract intelligence by crunching input data and produce smart outputs");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                correct = "a";
                break;
            case 34:
                Quest.setText(questions+". Data driven ML algorithms extract intelligence by crunching input data but don’t produce smart outputs ");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                correct = "b";
                break;
            case 35:
                Quest.setText(questions+". Some of automation tools use AI for making automation easier or more maintainable.");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                correct = "a";
                break;
            case 36:
                Quest.setText(questions+". None of automation tools use AI for making automation easier or more maintainable.");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                correct = "b";
                break;
            case 37:
                Quest.setText(questions+". AI tools could use GUI Spiders which traverse the complete GUI and record the app. Over iterations, they are able to learn, compare and identify bugs");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                correct = "a";
                break;
            case 38:
                Quest.setText(questions+". AI tools could use GUI Spiders which traverse the complete GUI and record the app. Over iterations, they need something else to learn, compare and identify bugs");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                correct = "b";
                break;
            case 39:
                Quest.setText(questions+". This type of tool uses image processing technology instead of pixel comparison, can check various UI attributes such as color, positioning, size, etc., can find differences that are likely to be missed by testers.");
                a.setText("A) Visual, automated UI testing tools");
                b.setText("B) GUI Spiders tools");
                c.setText("C) API testing tools");
                d.setText("D) AI-Based Test Automation tools");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                correct = "a";
                break;
            case 40:
                Quest.setText(questions+". This type of tool uses ML and traverses the complete GUI and records the app, over iterations, it is able to learn, compare and identify bugs, may analyze GUI, DOM, performance, etc.");
                a.setText("A) Visual, automated UI testing tools");
                b.setText("B) GUI Spiders tools");
                c.setText("C) API testing tools");
                d.setText("D) AI-Based Test Automation tools");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                correct = "b";
                break;
            case 41:
                Quest.setText(questions+". This type of tool learn the APIs, the parameter variation and also sequences, etc., especially when there is no GUI to be tested.");
                a.setText("A) Visual, automated UI testing tools");
                b.setText("B) GUI Spiders tools");
                c.setText("C) API testing tools");
                d.setText("D) AI-Based Test Automation tools");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                correct = "c";
                break;
        }
        return correct;
    }

}
