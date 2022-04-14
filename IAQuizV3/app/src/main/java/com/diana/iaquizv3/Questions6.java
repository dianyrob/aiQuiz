package com.diana.iaquizv3;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Questions6 {

    public String fillQuestion(TextView Quest, Button a, Button b, Button c, Button d, int questions, int question){
        String correct = null;
        switch (question){
            case 1:
                Quest.setText(questions+". Test condition, Test data, Cost, Skill and tool, Domain understanding and bias, these related challenges are:");
                a.setText("A) Risks of testing AI systems");
                b.setText("B) Risks of developing AI systems");
                c.setText("C) Risks of deploying AI systems");
                d.setText("D)All of the above");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                correct = "a";
                break;
            case 2:
                Quest.setText(questions+". With large number of tests (each dataset being a test), how does one verify correctness of tests and completeness of tests? This type of risk is:");
                a.setText("A) Test condition related challenges");
                b.setText("B) Test data related challenges");
                c.setText("C) Risks of deploying AI systems");
                d.setText("D)All of the above");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                correct = "a";
                break;
            case 3:
                Quest.setText(questions+". Lack of a reliable test oracle to indicate what the correct output should be for and arbitrary input. This type of risk is:");
                a.setText("A) Test data related challenges ");
                b.setText("B) Test condition related challenges");
                c.setText("C) Cost related challenges");
                d.setText("D)All of the above");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                correct = "b";
                break;
            case 4:
                Quest.setText(questions+". Identification of false positives and false negatives. False positives are still easier to identify because failures are to be investigated. False negatives are difficult to identify because these tests are shown as pass. This type of risk is:");
                a.setText("A) Test data related challenges");
                b.setText("B) Cost related challenges ");
                c.setText("C) Test condition related challenges");
                d.setText("D)All of the above");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                correct = "c";
                break;
            case 5:
                Quest.setText(questions+". In AI test data is equal to a test case, especially for offline testing. This type of risk is:");
                a.setText("A) Test condition related challenges");
                b.setText("B) Test data related challenges");
                c.setText("C) Cost related challenges ");
                d.setText("D) Skill and tool related challenges");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                correct = "b";
                break;
            case 6:
                Quest.setText(questions+". A huge amount of test data is ideally required to test. This type of risk is:");
                a.setText("A) Test data related challenges");
                b.setText("B) Test condition related challenges");
                c.setText("C) Cost related challenges ");
                d.setText("D) Skill and tool related challenges");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                correct = "a";
                break;
            case 7:
                Quest.setText(questions+". Data availability can be a problem and data quality can be bad, requiring data cleanup. This type of risk is:");
                a.setText("A) Test condition related challenges");
                b.setText("B) Cost related challenges ");
                c.setText("C) Test data related challenges");
                d.setText("D) Skill and tool related challenges");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                correct = "c";
                break;
            case 8:
                Quest.setText(questions+". Tagged/annotated data is required for training and testing. Getting this type of data is expensive. This type of risk is:");
                a.setText("A) Test condition related challenges");
                b.setText("B) Cost related challenges ");
                c.setText("C) Skill and tool related challenges");
                d.setText("D) Test data related challenges");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                correct = "d";
                break;
            case 9:
                Quest.setText(questions+". Skill requirements for testing AI systems are high. The tester needs to understand how AI systems are built and how they need to be tested . This type of risk is:");
                a.setText("A) Test condition related challenges");
                b.setText("B) Cost related challenges ");
                c.setText("C) Skill and tool related challenges");
                d.setText("D) Test data related challenges");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                correct = "c";
                break;
            case 10:
                Quest.setText(questions+". Lack of structured information, tools and frameworks for AI systems testing. This type of risk is:");
                a.setText("A) Test condition related challenges");
                b.setText("B) Cost related challenges ");
                c.setText("C) Test data related challenges");
                d.setText("D) Skill and tool related challenges");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                correct = "d";
                break;
            case 11:
                Quest.setText(questions+". Formal proofs of an algorithm’s optimal quality do not guarantee that an application implements or uses the algorithm correctly. This type of risk is:");
                a.setText("A) Domain understanding and bias related challenges");
                b.setText("B) Cost related challenges ");
                c.setText("C) Test data related challenges");
                d.setText("D) Skill and tool related challenges");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                correct = "a";
                break;
            case 12:
                Quest.setText(questions+". Need for thorough coverage of input cases, based on domain, are required to avoid biases, incomplete coverage and potential for accidents. This type of risk is:");
                a.setText("A) Cost related challenges ");
                b.setText("B) Domain understanding and bias related changes");
                c.setText("C) Test data related challenges");
                d.setText("D) Skill and tool related challenges");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                correct = "b";
                break;
            case 13:
                Quest.setText(questions+". Some organizations have made their pre-trained models available and many AI developers make use of them. The models may have their own biases and shortcomings which may need to be discovered by testing. Since these are either unknown or undocumented, systems built using pre-trained models may fail in unanticipated ways or produce results that may be sub-optimal in some situations.");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                correct = "a";
                break;
            case 14:
                Quest.setText(questions+". None organization have made their pre-trained models available and none AI developers make use of them. The models may have their own biases and shortcomings which may need to be discovered by testing. Since these are either unknown or undocumented, systems built using pre-trained models may fail in unanticipated ways or produce results that may be sub-optimal in some situations.");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                correct = "b";
                break;
            case 15:
                Quest.setText(questions+". In large scale AI applications, large models are generated offline by executing algorithms on large data, that can be reused in a large variety of scenarios. This is a:");
                a.setText("A) Pre-trained model issue ");
                b.setText("B) Domain understanding issue");
                c.setText("C) Test data issue");
                d.setText("D) Skill and tool issue");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                correct = "a";
                break;
            case 16:
                Quest.setText(questions+". In these cases where such pre-trained models are used, there is always the risk that the underlying pattern/truth is not fully objective and fully accurate for the problem at hand. This is a:");
                a.setText("A) Domain understanding issue");
                b.setText("B) Pre-trained model issue ");
                c.setText("C) Test data issue");
                d.setText("D) Skill and tool issue");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                correct = "a";
                break;
            case 17:
                Quest.setText(questions+". In these cases where such pre-trained models are used, there is always the risk that the underlying pattern/truth is not fully objective and fully accurate for the problem at hand But such pretrained models offer an advantage in scenarios where the data available for the target problem is scarce and costly. This is a:");
                a.setText("A) Domain understanding issue");
                b.setText("B) Test data issue");
                c.setText("C) Pre-trained model issue ");
                d.setText("D) Skill and tool issue");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                correct = "c";
                break;
            case 18:
                Quest.setText(questions+". Testing the target system will carry forward the biases and specifies as presented by the pretrained layer. This is a:");
                a.setText("A) Domain understanding issue");
                b.setText("B) Test data issue");
                c.setText("C) Skill and tool issue");
                d.setText("D) Pre-trained model issue ");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                correct = "d";
                break;
            case 19:
                Quest.setText(questions+". Inherited biases which may not be apparent in absence of information about the data used to train the model. This is a:");
                a.setText("A) Pre-trained model issue ");
                b.setText("B) Domain understanding issue");
                c.setText("C) Test data issue");
                d.setText("D) Skill and tool issue");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                correct = "a";
                break;
            case 20:
                Quest.setText(questions+". Unknown or undocumented defects may result in failures of systems built using pre-trained models in unanticipated ways or produce sub-optimal result in some situations. This is a:");
                a.setText("A) Domain understanding issue");
                b.setText("B) Pre-trained model issue ");
                c.setText("C) Test data issue");
                d.setText("D) Skill and tool issue");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                correct = "b";
                break;
            case 21:
                Quest.setText(questions+". Susceptibility to the same attacks as the pre-trained model for example adversarial attacks. Known adversarial attacks for original model will have a higher likelihood of success on the new model created by transfer learning and will succeed on a pre-trained model with no changes. This is a:");
                a.setText("A) Domain understanding issue");
                b.setText("B) Test data issue");
                c.setText("C) Pre-trained model issue ");
                d.setText("D) Skill and tool issue");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                correct = "c";
                break;
            case 22:
                Quest.setText(questions+". Misconceptions about the similarities of the task and data between pre-trained model and your problem may produce bad results. This is a:");
                a.setText("A) Domain understanding issue");
                b.setText("B) Test data issue");
                c.setText("C) Skill and tool issue");
                d.setText("D) Pre-trained model issue ");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                correct = "d";
                break;
            case 23:
                Quest.setText(questions+". Data pipeline dissimilarities in the treatment of data may result in poor performance of the pre-trained model. This is a:");
                a.setText("A) Domain understanding issue");
                b.setText("B) Test data issue");
                c.setText("C) Skill and tool issue");
                d.setText("D) Pre-trained model issue ");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                correct = "d";
                break;
            case 24:
                Quest.setText(questions+". Working models may degrade over time because of the change in the relationship between input features and output. This is known as:");
                a.setText("A) Domain Drift");
                b.setText("B) Test data model");
                c.setText("C) Concept Drift (CD)");
                d.setText("D) Pre-trained model ");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                correct = "c";
                break;
            case 25:
                Quest.setText(questions+". To find out the occurrence of concept drift, periodic testing of working and integrated models with recent data samples is required.");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                correct = "a";
                break;
            case 26:
                Quest.setText(questions+". To find out the occurrence of concept drift, exporadic testing of working and integrated models with recent data samples is required.");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                correct = "b";
                break;
            case 27:
                Quest.setText(questions+". Do nothing, retrain the model with recent data, periodically update the model by using the latest data on the current model, learn the change, detect and choose model. These are:");
                a.setText("A) Ways to handle concept drift");
                b.setText("B) Ways to handle test data");
                c.setText("C) Ways to handle model issues");
                d.setText("D) Pre-trained model issues ");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                correct = "a";
                break;
            case 28:
                Quest.setText(questions+". AI systems may need to be tested again as time passes, the input/output relationship may change over time, thus invalidating the model and the need for retraining, retraining frequency for the model need to be considered if the new data emerges quickly. These are:");
                a.setText("A) Ways to handle test data");
                b.setText("B) Ways to handle concept drift");
                c.setText("C) Ways to handle model issues");
                d.setText("D) Pre-trained model issues ");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                correct = "b";
                break;
            case 29:
                Quest.setText(questions+". Over time, we need to ask: Is the model behaving correctly, as expected?, AI features are likely to continuously evolve. These are:");
                a.setText("A) Ways to handle test data");
                b.setText("B) Ways to handle model issues");
                c.setText("C) Ways to handle concept drift");
                d.setText("D) Pre-trained model issues ");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                correct = "c";
                break;
            case 30:
                Quest.setText(questions+". The test environments for AI systems can be very complex, owing to possible different use-cases, contexts, and various ways and steps of data preprocessing.");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                correct = "a";
                break;
            case 31:
                Quest.setText(questions+". The test environments for AI systems are very easy to create, owing to possible different use-cases, contexts, and various ways and steps of data preprocessing.");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                correct = "b";
                break;
            case 32:
                Quest.setText(questions+". From the offline testing point of view, the environment needs are more demanding than from the online testing point of view.");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                correct = "a";
                break;
            case 33:
                Quest.setText(questions+". From the offline testing point of view, the environment needs are less demanding than from the online testing point of view.");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                correct = "b";
                break;
            case 34:
                Quest.setText(questions+". In the AI Test environments there is a need for a large size of data storage, high network bandwidth requirement and also for greater computational power to train/run the model.");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                correct = "a";
                break;
            case 35:
                Quest.setText(questions+". In the AI Test environments we don’t need a large size of data storage, high network bandwidth requirement and also for greater computational power to train/run the model.");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                correct = "b";
                break;
            case 36:
                Quest.setText(questions+". A real-world AI based application might employ one or more AI and non-AI components. The test strategy for such a system will include conventional test dimensions as well as new factors specific to AI components and their integration with other system components.");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                correct = "a";
                break;
            case 37:
                Quest.setText(questions+". A real-world AI based application only employ non-AI components. The test strategy for such a system will include conventional test dimensions as well as new factors specific to AI components and their integration with other system components.");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                correct = "b";
                break;
            case 38:
                Quest.setText(questions+". The test strategy for testing AI applications include the next considerations:");
                a.setText("A) Level of testing required for the system");
                b.setText("B) Test techniques and use of test automation");
                c.setText("C) Functional and non-functional test");
                d.setText("D) All of the above ");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                correct = "d";
                break;
            case 39:
                Quest.setText(questions+". For testing AI based applications, one additional aspect to take into account is:");
                a.setText("A) Offline testing (functional and non-functional)");
                b.setText("B) Black-box and Whithe-box testing");
                c.setText("C) Data adquisition and preprocessing");
                d.setText("D) All of the above ");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                correct = "d";
                break;
            case 40:
                Quest.setText(questions+". For testing AI based applications, one additional aspect to take into account is converting of development environment implementation to production.");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                correct = "a";
                break;
            case 41:
                Quest.setText(questions+". For testing AI based applications, one additional aspect to take into account is that is not required converting of development environment implementation to production.");
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
