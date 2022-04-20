package com.diana.iaquizv3;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Questions4 {

    public String fillQuestion(TextView Quest, Button a, Button b, Button c, Button d, int questions, int question){
        String correct = null;
        switch (question){
            case 1:
                Quest.setText(questions+". A typical AI application needs to be examined, whether it is a monolithic AI application, or an overall system comprised of a smaller set of AI components invoked from a larger non- AI application. This analysis is required to understand how various components, AI and non-AI, work together to provide the desired functionality.");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                correct = "a";
                break;
            case 2:
                Quest.setText(questions+". A typical AI application doesn’t need to be examined, whether it is a monolithic AI application, or an overall system comprised of a smaller set of AI components invoked from a larger non- AI application. This analysis is required to understand how various components, AI and non-AI, work together to provide the desired functionality.");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                correct = "b";
                break;
            case 3:
                Quest.setText(questions+". The interfaces between AI and non-AI components need to be understood from the point of view of:");
                a.setText("A) Input data being passed, Output generated, Actions taken by the components");
                b.setText("B) Direct user interface, Third party user interactions, Frequency of invocation");
                c.setText("C) Number of parallel invocations, constraints as timing, duration, ranges of input and outpus");
                d.setText("D)All of the above");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                correct = "d";
                break;
            case 4:
                Quest.setText(questions+". The interfaces between AI and non-AI components need to be understood from the point of view of:");
                a.setText("A) Necessary pre-conditions, Assumptions/common settings");
                b.setText("B) Visualizing the chain of inputs and outputs with relevant transformations");
                c.setText("C) Error and exceptions and their handling by the component, chain of components and final handling, logging");
                d.setText("D)All of the above");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                correct = "d";
                break;
            case 5:
                Quest.setText(questions+". The AI system should interpret the way humans can do in an explainable manner: Image data, Text data, Audio data");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                correct = "a";
                break;
            case 6:
                Quest.setText(questions+". The AI system doesn’t interpret the way humans can do in an explainable manner: Image data, Text data, Audio data");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                correct = "b";
                break;
            case 7:
                Quest.setText(questions+". Different ways of identifying test scenarios in AI systems are: Linguistic analysis, Q-patterns for building blocks, Explanations, Marriage of linguistics & explanations");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                correct = "a";
                break;
            case 8:
                Quest.setText(questions+". Different ways of identifying test execution in AI systems are: Linguistic analysis, Q-patterns for building blocks, Explanations, Marriage of linguistics & explanations");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                correct = "b";
                break;
            case 9:
                Quest.setText("Non-Functional tests applied to AI systems are: Security, Performance related, Error related");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                correct = "a";
                break;
            case 10:
                Quest.setText(questions+". Non-Functional tests are not applied to AI systems");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                correct = "b";
                break;
            case 11:
                Quest.setText(questions+". There is a need for the explainability of the reason for the system to arrive at the given solution. In addition, there is a need for identifying test scenarios for these AI systems using techniques such as linguistic analysis and exploratory testing");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                correct = "a";
                break;
            case 12:
                Quest.setText(questions+". Is not needed the explainability of the reason for the system to arrive at the given solution. In addition, there is a need for identifying test scenarios for these AI systems using techniques such as linguistic analysis and exploratory testing");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                correct = "b";
                break;
            case 13:
                Quest.setText(questions+". Other issue of complexity which needs to be ensured is the presence or absence of combinations of AI systems. Single standalone AI systems may be insufficient to completely specify a real-world problem. To handle these scenarios, combinations of AI systems are used to model the problem. To that end, a test strategy to handle combinations of AI systems is required");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                correct = "a";
                break;
            case 14:
                Quest.setText(questions+". Other issue of complexity which doesn’t need to be ensured is the presence or absence of combinations of AI systems. Single standalone AI systems may be insufficient to completely specify a real-world problem. To handle these scenarios, combinations of AI systems are used to model the problem. To that end, a test strategy to handle combinations of AI systems is required");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                correct = "b";
                break;
            case 15:
                Quest.setText(questions+". In AI - non-AI interaction, there is a need to ensure the test coverage of the AI component, the non-AI component, and the interaction involving handover between the two parts");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                correct = "a";
                break;
            case 16:
                Quest.setText(questions+". In AI - non-AI interaction, is not needed to ensure the test coverage of the AI component, the non-AI component, and the interaction involving handover between the two parts");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                correct = "b";
                break;
            case 17:
                Quest.setText(questions+". Real-world problems are too complex to be based on a monolithic AI system");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                correct = "a";
                break;
            case 18:
                Quest.setText(questions+". Real-world problems are too complex and should be based on a monolithic AI system");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                correct = "b";
                break;
            case 19:
                Quest.setText(questions+". In the test strategy for the integration of an ensemble of AI systems (each already tested individually), the first classifier identifies the category of input data, this classification is also a learned response");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                correct = "a";
                break;
            case 20:
                Quest.setText(questions+". In the test strategy for the integration of an ensemble of AI systems (each already tested individually), the last classifier identifies the category of input data, this classification is also a learned response");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                correct = "b";
                break;
            case 21:
                Quest.setText(questions+". Each AI system of the ensemble may employ any AI model/algorithm independent of its peer components");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                correct = "a";
                break;
            case 22:
                Quest.setText(questions+". None AI system of the ensemble employ any AI model/algorithm independent of its peer components");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                correct = "b";
                break;
            case 23:
                Quest.setText(questions+". In the information-oriented calls, the API or service of the AI application is invoked from an end application which can be non-AI. Typically, the AI component is invoked for a response");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                correct = "a";
                break;
            case 24:
                Quest.setText(questions+". In the information-oriented calls, the API or service of the AI application is invoked from an end application which should be a non-AI. Typically, the AI component is invoked for a response");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                correct = "b";
                break;
            case 25:
                Quest.setText(questions+". Boundary value-based tests – both input and output, Unusual test cases (a.k.a. Corner test cases), Tests related to the size and type of data to be passed, Exception handling tests like Response not received and Broken request-response feedback loop for actions, Erroneous input data tests, Erroneous output data tests, Request could not be completed, Response not received, Performance related tests, Security related tests, Robustness related tests, are some of the important tests for testing the interactions");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                correct = "a";
                break;
            case 26:
                Quest.setText(questions+". Boundary value-based tests – both input and output, Unusual test cases (a.k.a. Corner test cases), Tests related to the size and type of data to be passed, Exception handling tests like Response not received and Broken request-response feedback loop for actions, Erroneous input data tests, Erroneous output data tests, Request could not be completed, Response not received, Performance related tests, Security related tests, Robustness related tests, are some of the important tests for testing the performance");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                correct = "b";
                break;
            case 27:
                Quest.setText(questions+". The interactions between the AI and non-AI components may have an impact on the experience of the user. The interactions can be of the following type:");
                a.setText("A) Flag only ");
                b.setText("B) Action oriented");
                c.setText("C) Scenarios of failure of interacting APIs where the APIs fail to return a result ");
                d.setText("D)All of the above");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                correct = "d";
                break;
            case 28:
                Quest.setText(questions+". The interactions between the AI and non-AI components may have an impact on the experience of the user. The interactions can be of the following type:");
                a.setText("A) Flag only ");
                b.setText("B) Action oriented");
                c.setText("C) Handover from AI to non-AI components and vice-versa");
                d.setText("D)All of the above");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                correct = "d";
                break;
            case 29:
                Quest.setText(questions+". When tests are designed for the AI systems, these are of following test levels: Tests that just test the AI part, Tests that just test the non-AI part, Tests for integration of both parts, Cached response vs. learned responses");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                correct = "a";
                break;
            case 30:
                Quest.setText(questions+". When tests are designed for the AI systems, these are of following test scenarios: Tests that just test the AI part, Tests that just test the non-AI part, Tests for integration of both parts, Cached response vs. learned responses");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                correct = "b";
                break;
            case 31:
                Quest.setText(questions+". In a larger non-standalone system, there is a need to look at the coverage of the deployed AI model as well as the performance management of the deployed AI model. After the development of AI component, the system needs to be tested in a development environment. ");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                correct = "a";
                break;
            case 32:
                Quest.setText(questions+". In a larger non-standalone system, there is a need to look at the coverage of the deployed AI model as well as the performance management of the deployed AI model. After the development of AI component, the system needs to be tested in a production environment. ");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                correct = "b";
                break;
            case 33:
                Quest.setText(questions+". Linguistic Analysis is used to design a large number of scenarios even when the requirements are poorly documented. A linguistic analysis of the requirements identifies the test objects, and the actions to be taken on them. This method helps finding corner (unusual) test cases, a key requirement for testing AI systems.");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                correct = "a";
                break;
            case 34:
                Quest.setText(questions+". Linguistic Analysis is used to design a short number of scenarios even when the requirements are poorly documented. A linguistic analysis of the requirements identifies the test objects, and the actions to be taken on them. This method helps finding corner (unusual) test cases, a key requirement for testing AI systems.");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                correct = "b";
                break;
        }
        return correct;
    }

}
