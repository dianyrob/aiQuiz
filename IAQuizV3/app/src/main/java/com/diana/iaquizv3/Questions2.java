package com.diana.iaquizv3;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Questions2 {

    public void fillQuestion(TextView Quest, TextView qNum, Button a, Button b, Button c, Button d, int questions, int question){
        switch (question){
            case 1:
                qNum.setText(questions+".");
                Quest.setText("How can be performed the testing of AI Systems?");
                a.setText("A) At the stage of training the algorithm");
                b.setText("B) As in the design cycle");
                c.setText("C) As part of the system testing");
                d.setText("D) All of the above");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 2:
                qNum.setText(questions+".");
                Quest.setText("While testing AI Systems we will treat the algorithm as a black box and look at testing as part of system testing");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 3:
                qNum.setText(questions+".");
                Quest.setText("While testing AI Systems we won’t treat the algorithm as a black box and look at testing as part of system testing ");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 4:
                qNum.setText(questions+".");
                Quest.setText("Testing AI systems is a two-stage process: Testing the trained model and Testing the integrated system.");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 5:
                qNum.setText(questions+".");
                Quest.setText("Testing AI systems is a four-stage process: Testing the trained model, Testing the integrated system, Testing the AI and Testing the non-AI system components.");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 6:
                qNum.setText(questions+".");
                Quest.setText("What kind of testing is done in a trained model?");
                a.setText("A) Online testing");
                b.setText("B) Offline testing");
                c.setText("C) Functional testing");
                d.setText("D) Regression testing");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 7:
                qNum.setText(questions+".");
                Quest.setText("What kind of testing is done in integrated system");
                a.setText("A) Online testing");
                b.setText("B) Offline testing");
                c.setText("C) Functional testing");
                d.setText("D) Regression testing");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 8:
                qNum.setText(questions+".");
                Quest.setText("In this phase, the trained model is tested. Various metrics are used for evaluation parameters for a trained model to verify how far it has achieved the objectives.");
                a.setText("A) Online testing");
                b.setText("B) Offline testing");
                c.setText("C) Functional testing");
                d.setText("D) Regression testing");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 9:
                qNum.setText(questions+".");
                Quest.setText("In this phase, the integration of the trained model with the rest of the system, including all other AI and non-AI components, is tested. Both functional and non-functional tests such as performance tests can be performed");
                a.setText("A) Online testing");
                b.setText("B) Offline testing");
                c.setText("C) Functional testing");
                d.setText("D) Regression testing");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 10:
                qNum.setText(questions+".");
                Quest.setText("Since the inputs to the system can be non-textual, unstructured inputs, as well automation support for some of the tests related to the ML part, may be limited, based on the tool being used.");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 11:
                qNum.setText(questions+".");
                Quest.setText("Since the inputs to the system can be non-textual, unstructured inputs, as well automation support for some of the tests related to the ML part, won’t be limited, based on the tool being used.");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("C) ");
                d.setText("D) ");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 12:
                qNum.setText(questions+".");
                Quest.setText("Testing AI Systems is not deterministic. The results of the test are probabilities");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 13:
                qNum.setText(questions+".");
                Quest.setText("Testing AI Systems is deterministic. The results of the test are well defined");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 14:
                qNum.setText(questions+".");
                Quest.setText("Test oracles for AI systems are not easily available");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 15:
                qNum.setText(questions+".");
                Quest.setText("Test oracles for AI systems are easily available");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("C) ");
                d.setText("D) ");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 16:
                qNum.setText(questions+".");
                Quest.setText("Data are the test cases for the AI");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 17:
                qNum.setText(questions+".");
                Quest.setText("Data are the test cases for the neuronal networks");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 18:
                qNum.setText(questions+".");
                Quest.setText("Data pre-processing and clean up constitute a vital part of AI system testing");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 19:
                qNum.setText(questions+".");
                Quest.setText("Data pre-processing and clean up constitute is not considered as part of AI system testing");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 20:
                qNum.setText(questions+".");
                Quest.setText("The internals of learning systems are generally not easy to understand");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 21:
                qNum.setText(questions+".");
                Quest.setText("The internals of learning systems are very easy to understand");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 22:
                qNum.setText(questions+".");
                Quest.setText("The explainability of the results is difficult for ML and nearly impossible for DL systems");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 23:
                qNum.setText(questions+".");
                Quest.setText("The explainability of the results is easy for ML and very possible for DL systems");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 24:
                qNum.setText(questions+".");
                Quest.setText("AI systems logic is generated based on the data used to train the model");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 25:
                qNum.setText(questions+".");
                Quest.setText("AI Systems logic is not generated based on the data used to train the model");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 26:
                qNum.setText(questions+".");
                Quest.setText("AI Systems logic is not available for examination, especially neural nets. This makes it difficult to understand why a particular output was produced. A correct or desired answer doesn’t guarantee correct functioning.");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 27:
                qNum.setText(questions+".");
                Quest.setText("AI Systems logic is always available for examination, especially neural nets. This makes it difficult to understand why a particular output was produced. A correct or desired answer doesn’t guarantee correct functioning.");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 28:
                qNum.setText(questions+".");
                Quest.setText("Testing in the offline phase is an additional step which requires specialized skills and techniques for testing the trained model");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 29:
                qNum.setText(questions+".");
                Quest.setText("Testing in the offline phase is an step which anyone can do without specialized skills and techniques for testing the trained model");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 30:
                qNum.setText(questions+".");
                Quest.setText("Testing in the online phase requires a deep understanding of how AI systems work and how to integrate these with other AI and non-AI systems. As a consequence, it calls for an increased for diverse test design techniques.");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 31:
                qNum.setText(questions+".");
                Quest.setText("Testing in the online phase requires a deep understanding of how AI systems work and how to integrate these with other AI and non-AI systems. As a consequence, it calls for a decreased for test design techniques.");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 32:
                qNum.setText(questions+".");
                Quest.setText("Black-box testing methods and conventional testing are also applicable to AI based systems testing");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 33:
                qNum.setText(questions+".");
                Quest.setText("Black-box testing methods and conventional testing are not applicable to AI based systems testing");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 34:
                qNum.setText(questions+".");
                Quest.setText("Similar to non-AI systems, both functional and non-functional tests need to be executed for AI systems");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 35:
                qNum.setText(questions+".");
                Quest.setText("Functional and non-functional tests are not required to be executed for AI systems ");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 36:
                qNum.setText(questions+".");
                Quest.setText("Online phase testing can be performed as normal black-box system and system integration testing without worrying whether there are one or more AI components in the mix.");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 37:
                qNum.setText(questions+".");
                Quest.setText("Online phase testing cannot be performed as normal black-box system and system integration testing without worrying whether there are one or more AI components in the mix.");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 38:
                qNum.setText(questions+".");
                Quest.setText("The behaviors of Learning Systems depend on the input data");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 39:
                qNum.setText(questions+".");
                Quest.setText("The behaviors of Learning Systems depend on the tester experience");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 40:
                qNum.setText(questions+".");
                Quest.setText("Different data used in the testing will lead to potentially different behaviors");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 41:
                qNum.setText(questions+".");
                Quest.setText("Different data used in the testing will lead to the same behaviors ");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 42:
                qNum.setText(questions+".");
                Quest.setText("For AI systems, test data = test cases");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 43:
                qNum.setText(questions+".");
                Quest.setText("For AI systems, test data = the user requirements ");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 44:
                qNum.setText(questions+".");
                Quest.setText("Some of the important characteristics from the AI testing perspective are:");
                a.setText("A) Functional suitability, Reliability, Performance efficiency");
                b.setText("B) Maintainability, Complexity, Scalability, Continuous learning ");
                c.setText("C) None of the above");
                d.setText("D) All of the above");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 45:
                qNum.setText(questions+".");
                Quest.setText("While evaluating AI Systems, this characteristic is one of the most important parameters for accepting a solution.");
                a.setText("A) Maintainability ");
                b.setText("B) Performance efficiency ");
                c.setText("C) Reliability ");
                d.setText("D) Functional suitability ");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 46:
                qNum.setText(questions+".");
                Quest.setText("While evaluating AI Systems, this characteristic includes functional correctness, completeness and appropriateness are expected with some sort of error estimation to quantitatively measure the system");
                a.setText("A) Functional suitability ");
                b.setText("B) Performance efficiency ");
                c.setText("C) Reliability ");
                d.setText("D) Maintainability ");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 47:
                qNum.setText(questions+".");
                Quest.setText("While evaluating AI Systems, this characteristic is the availability of the system during normal operations");
                a.setText("A) Functional suitability ");
                b.setText("B) Performance efficiency ");
                c.setText("C) Reliability ");
                d.setText("D) Maintainability ");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 48:
                qNum.setText(questions+".");
                Quest.setText("While evaluating AI Systems, this characteristic where the fault tolerance of the system should be high enough to handle corrupt data, incomplete, or irrelevant data without breaking down ");
                a. setText("A) Functional suitability ");
                b. setText("B) Reliability ");
                c. setText("C) Performance efficiency ");
                d. setText("D) Maintainability ");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 49:
                qNum.setText(questions+".");
                Quest.setText("While evaluating AI Systems, this characteristic includes the Time behavior and the Resource utilization");
                a.setText("A) Functional suitability ");
                b.setText("B) Reliability ");
                c.setText("C) Performance efficiency ");
                d.setText("D) Maintainability ");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 50:
                qNum.setText(questions+".");
                Quest.setText("Is how quickly the system responds to the demands made from it?");
                a.setText("A) Functional suitability ");
                b.setText("B) Reliability ");
                c.setText("C) Resource utilization");
                d.setText("D) Time behavior");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 51:
                qNum.setText(questions+".");
                Quest.setText("Is which and how many resources are used by the system to perform a function?");
                a.setText("A) Functional suitability ");
                b.setText("B) Reliability ");
                c.setText("C) Resource utilization");
                d.setText("D) Time behavior");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 52:
                qNum.setText(questions+".");
                Quest.setText("While evaluating AI Systems, this characteristic includes the Analyzability and Testability");
                a.setText("A) Functional suitability ");
                b.setText("B) Reliability ");
                c.setText("C) Performance efficiency ");
                d.setText("D) Maintainability ");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 53:
                qNum.setText(questions+".");
                Quest.setText("Refers to the ability to be able to understand why the system took the decision that it took.");
                a.setText("A) Functional suitability ");
                b.setText("B) Analyzability ");
                c.setText("C) Performance efficiency ");
                d.setText("D) Maintainability ");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 54:
                qNum.setText(questions+".");
                Quest.setText("Time and space complexity");
                a.setText("A) Functional suitability ");
                b.setText("B) Analyzability ");
                c.setText("C) Complexity ");
                d.setText("D) Testability ");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 55:
                qNum.setText(questions+".");
                Quest.setText("The ability of the system to handle more load by adding additional resources to it");
                a.setText("A) Scalability");
                b.setText("B) Analyzability ");
                c.setText("C) Complexity ");
                d.setText("D) Testability ");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 56:
                qNum.setText(questions+".");
                Quest.setText("The ability of the system to continuously learn from new data, especially from real time environment data");
                a.setText("A) Scalability");
                b.setText("B) Analyzability ");
                c.setText("C) Complexity ");
                d.setText("D) Continuous learning ");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 57:
                qNum.setText(questions+".");
                Quest.setText("This characteristic Is the ability to comprehend or understand. It is basically a combination of reasoning, memory, imagination, and judgment; each of these faculties relies upon the others.");
                a.setText("A) Scalability");
                b.setText("B) Analyzability ");
                c.setText("C) Intelligent behavior ");
                d.setText("D) Continuous learning ");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 58:
                qNum.setText(questions+".");
                Quest.setText("This characteristic is about the principles concerning the distinction between right and wrong or good and bad behavior. The sub-characteristics are: ethics, privacy and human friendliness.");
                a.setText("A) Morality");
                b.setText("B) Analyzability ");
                c.setText("C) Intelligent behavior ");
                d.setText("D) Continuous learning ");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 59:
                qNum.setText(questions+".");
                Quest.setText("This characteristic is the combination of characteristics or qualities that perform an individual’s distinctive character. The sub-characteristics are: mood, empathy, humor and charisma");
                a.setText("A) Morality");
                b.setText("B) Analyzability ");
                c.setText("C) Intelligent behavior ");
                d.setText("D) Personality");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
        }

    }
}
