package com.diana.iaquizv3;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Questions1 {
    public void fillQuestion(TextView Quest, Button a, Button b, Button c, Button d, int questions, int question){

        switch (question){
            case 1:
                //qNum.setText(questions+".");
                Quest.setText(questions+". Is the intelligence acquired by a machine to solve problems usually solved by humans? ");
                a.setText("A) Artificial knowledge");
                b.setText("B) Artificial intelligence");
                c.setText("C) Machine learning");
                d.setText("D) Deep learning");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 2:
                //qNum.setText(questions+".");
                Quest.setText(questions+". In which sectors is Al playing a leading role?");
                a.setText("A) Healthcare and manufacturing");
                b.setText("B) E-commerce and retail");
                c.setText("C) Social Media and logistics ");
                d.setText("D) All of the above");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 3:
                Quest.setText(questions+". How is the Artificial Intelligence categorized?");
                a.setText("A) Narrow");
                b.setText("B) General");
                c.setText("C) Super AI ");
                d.setText("D) All of the above");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 4:
                Quest.setText(questions+". Is the category for the machines that are programmed for carrying out a specific task with limited context. For example, game playing machines, voice assistants and all AI currently:");
                a.setText("A) Simple AI");
                b.setText("B) Narrow");
                c.setText("C) General");
                d.setText("D) Super AI");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 5:
                Quest.setText(questions+". Is the category for the machines with general cognitive abilities are popularly called as Strong AI cases. These AIs can reason and understand their environment as humans do, and act accordingly. For instance, common- sense reasoning:");
                a.setText("A) Single AI");
                b.setText("B) Narrow");
                c.setText("C) General");
                d.setText("D) Super AI ");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 6:
                Quest.setText(questions+". Is the category for machines that are capable of replicating human thoughts, ideas and emotions. It is that super state of intelligence where machines will become smarter and wiser than humans. ");
                a.setText("A) Simple AI");
                b.setText("B) Narrow");
                c.setText("C) General");
                d.setText("D) Super AI ");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 7:
                Quest.setText(questions+". These are the systems that learn and improve with experience, and, with time, refine a model that can be used to predict the outcome of questions, based on the previous learning? ");
                a.setText("A) Artificial knowledge");
                b.setText("B) Artificial intelligence");
                c.setText("C) Machine learning");
                d.setText("D) Deep learning");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 8:
                Quest.setText(questions+". Some of the technologies used to accomplish AI are: Machine Learning (ML), Natural Language Processing (NLP), Robotics, Speech Processing, Computer Vision ");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 9:
                Quest.setText(questions+". Some of the technologies used to accomplish ML are: Artificial Intelligence (AI), Natural Language Processing (NLP), Robotics, Speech Processing, Computer Vision ");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 10:
                Quest.setText(questions+". These are a few ways in which ML algorithms can be categorized: Supervised Learning, Unsupervised Learning, Reinforcement Learning ");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 11:
                Quest.setText(questions+". These are a few ways in which AI can be categorized: Supervised Learning, Unsupervised Learning, Reinforcement Learning ");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 12:
                Quest.setText(questions+". In this kind of learning, the model learns from labeled data during the training phase. The labeled data acts as a trainer/supervisor for the mapping function which infers the relationship between input data and the output label during the training. During the testing phase, the mapping function is then applied to a new set of unseen data to predict the output which is also labeled. The model is deployed once the output accuracy level is satisfactory. ");
                a.setText("A) Supervised Learning");
                b.setText("B) Unsupervised Learning");
                c.setText("C) Machine Learning");
                d.setText("D) Artificial Intelligence");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 13:
                Quest.setText(questions+". Problems solved by Supervised Learning are further divided into two categories: ");
                a.setText("A) Classification and Deep Learning");
                b.setText("B) Classification and Regression");
                c.setText("C) Deed Learning and Regression");
                d.setText("D) Machine Learning and Deep Learning");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 14:
                Quest.setText(questions+". Is the category when the problem requires classifying an input into one of a few pre-decided classes, supervised learning is used. This kind of model is used when the output data is discrete or when the output falls among the number of classes fed during training. ");
                a.setText("A) Classification");
                b.setText("B) Regression");
                c.setText("C) Deep Learning");
                d.setText("D) Artificial Intelligence");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 15:
                Quest.setText(questions+". Some of the commonly used algorithms for classification are logistic regression, nearest neighbor, support vector machine, and neural nets. ");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 16:
                Quest.setText(questions+". Is the category is used when the output data is continuous or numeric in nature, e.g., predicting the age/weight of a person, predicting the future price of the stock, etc.");
                a.setText("A) Classification");
                b.setText("B) Regression");
                c.setText("C) Deep Learning");
                d.setText("D) Artificial Intelligence");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 17:
                Quest.setText(questions+". Clean, labeled data are not readily available all the time, so that certain problems need to be solved without an explicitly labeled training set. This kind of ML where no labeled data is provided explicitly is called:");
                a.setText("A) Supervised Learning");
                b.setText("B) Unsupervised Learning");
                c.setText("C) Machine Learning");
                d.setText("D) Artificial Intelligence");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 18:
                Quest.setText(questions+". Unsupervised Learning is further classified in the following two methods, based on the type of outputs:");
                a.setText("A) Classification and Regression");
                b.setText("B) Regression and Association ");
                c.setText("C) Clustering and Association ");
                d.setText("D) Association and Classification");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 19:
                Quest.setText(questions+". This Unsupervised Learning model groups the input data based on some common characteristics or attributes. Input data with similar attributes (not labeled) are grouped in one cluster. Thus, the outputs are clusters of input data. For instance, customer segmentation in market analysis. ");
                a.setText("A) Classification");
                b.setText("B) Clustering");
                c.setText("C) Regression");
                d.setText("D) Association");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 20:
                Quest.setText(questions+". Association Rule Mining finds interesting relationships or dependencies among the data attributes. The discovery of interesting associations provides a source of information often used for decision making. ");
                a.setText("A) Classification");
                b.setText("B) Clustering");
                c.setText("C) Regression");
                d.setText("D) Association");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 21:
                Quest.setText(questions+". It is a type of ML where an agent (algorithm) learns by interacting with the environment in an iterative manner and thereby learns from experience. The agent is rewarded when it makes a right decision and penalized when it makes a wrong one. This reward and penalty-based learning is thus defined as:");
                a.setText("A) Supervised Learning");
                b.setText("B) Unsupervised Learning");
                c.setText("C) Reinforcement Learning");
                d.setText("D) Deep Learning");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 22:
                Quest.setText(questions+". This type of learning refers to the systems gaining experience from massive data sets. It uses Artificial Neural Networks (ANN) to analyze large data sets, e.g. Autonomous Vehicles, Large Text Processing, and Computer Vision applications among others");
                a.setText("A) Supervised Learning");
                b.setText("B) Unsupervised Learning");
                c.setText("C) Reinforcement Learning");
                d.setText("D) Deep Learning");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 23:
                Quest.setText(questions+". Deep Learning uses the same types of learning (Supervised, Unsupervised and Reinforcement Learning) as ML. ");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 24:
                Quest.setText(questions+". Deep Learning uses different types of learning (Supervised, Unsupervised and Reinforcement Learning) as ML. ");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 25:
                Quest.setText(questions+". These are inspired by the architecture of the human brain. ‘Neurons’, as the basic unit of ANN, act upon the input stimulus and produce the output signal. The input goes through \n" +
                        "the layers of activation functions to generate the output. These layers form a mesh like network. \n");
                a.setText("A) Artificial Neuronal Networks");
                b.setText("B) Deep Neuronal Network");
                c.setText("C) Convolutional Neuronal Network");
                d.setText("D) Recurrent Neuronal Network");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 26:
                Quest.setText(questions+". Is a type of neural networks?");
                a.setText("A) Deep Neuronal Network");
                b.setText("B) Convolutional Neuronal Network");
                c.setText("D) Recurrent Neuronal Network");
                d.setText("E) All of the above");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 27:
                Quest.setText(questions+". Is an Artificial Neuronal Network with two or more hidden layers?");
                a.setText("A) Deep Neuronal Network");
                b.setText("B) Convolutional Neuronal Network");
                c.setText("C) Recurrent Neuronal Network");
                d.setText("D) None of the above");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 28:
                Quest.setText(questions+". Is an Artificial Neuronal Network that emerged from the study of the brain’s visual cortex, and they have been used in image recognition since the 1980s. Unlike other neural networks, this works directly on input images without serializing/ vectorizing an input image and extracting features by filters:");
                a.setText("A) Deep Neuronal Network");
                b.setText("B) Convolutional Neuronal Network");
                c.setText("C) Recurrent Neuronal Network");
                d.setText("D)None of the above");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 29:
                Quest.setText(questions+". These ANNs can predict the future of time series problems. They follow a sequential approach on series of input data of arbitrary length rather than inputs of fixed length as in other neural networks. Each input and output are independent of all the other layers. The feedback from the output layer is fed to the same network recurrently, till the right level of confidence is achieved:");
                a.setText("A) Deep Neuronal Network");
                b.setText("B) Convolutional Neuronal Network");
                c.setText("C) Recurrent Neuronal Network");
                d.setText("D) None of the above");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 30:
                Quest.setText(questions+". Which is CRISP-DM?");
                a.setText("A) Cross Industry Standard Process for the Data Mining ");
                b.setText("B) Critical Industry Size Process for the Deep Mining");
                c.setText("C) Cross Industry Selection Product for the Data Mining");
                d.setText("D) Critical Industry Standard Process for Deep Mining");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 31:
                Quest.setText(questions+". CRISP-DM has traditionally six stages in the data mining life cycle. It has been customized to meet the requirements of ML projects, by adding a seventh stage. ");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 32:
                Quest.setText(questions+". CRISP-DM has traditionally eight stages in the data mining life cycle. It has been customized to meet the requirements of ML projects, by adding a eighth stage.");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 33:
                Quest.setText(questions+". Are some of the stages of the CRISP-DM framework for ML?");
                a.setText("A) Data acquisition and Data preparation ");
                b.setText("B) Modeling and Evaluation ");
                c.setText("C) Deployment, Operations and Optimization ");
                d.setText("D) All of the above");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 34:
                Quest.setText(questions+". This stage gathers data from all internal and external sources (for example databases, CSV files, social media, etc.):");
                a.setText("A) Data acquisition");
                b.setText("B) Data preparation ");
                c.setText("C) Modeling");
                d.setText("D) Evaluation ");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 35:
                Quest.setText(questions+". This stage cleans the raw data and reshape it. New attributes are created with feature engineering, a process for creating new variables from existing data. ");
                a.setText("A) Data acquisition");
                b.setText("B) Data preparation ");
                c.setText("C) Modeling");
                d.setText("D) Evaluation ");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 36:
                Quest.setText(questions+". This stage selects the model or algorithm, divide the available data into training set and testing set. Models are obtained by executing ML algorithms on the training data set. Use the testing data set to evaluate and enhance the performance of the model until satisfactory performance is achieved. ");
                a.setText("A) Data acquisition");
                b.setText("B) Data preparation ");
                c.setText("C) Modeling");
                d.setText("D) Evaluation ");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 37:
                Quest.setText(questions+". This stage evaluates the model on various metrics (discussed in 3.2 Metrics) and baseline it before it goes for final deployment. ");
                a.setText("A) Data acquisition");
                b.setText("B) Data preparation ");
                c.setText("C) Modeling");
                d.setText("D) Evaluation ");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 38:
                Quest.setText(questions+". This stage deploys and monitor the baselined model for metrics in the production environment.");
                a.setText("A) Data preparation ");
                b.setText("B) Modeling");
                c.setText("C) Evaluation ");
                d.setText("D) Deployment");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 39:
                Quest.setText(questions+". This stage carries out regular maintenance and operations. Regenerate and refine the model when the metrics fall below a certain threshold. ");
                a.setText("A) Evaluation");
                b.setText("B) Deployment");
                c.setText("C) Operations");
                d.setText("D) Optimization");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 40:
                Quest.setText(questions+". In this stage deployed solution may be replaced due to concept, as better algorithms become available, or because of some major failures in performance. ");
                a.setText("A) Evaluation");
                b.setText("B) Deployment");
                c.setText("C) Operations");
                d.setText("D) Optimization");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 41:
                Quest.setText(questions+". Select the sentence best describe artificial intelligence:");
                a.setText("A) The art of creating programs that perform functions that required intelligence when performed by people");
                b.setText("B) The art of creating machines that perform functions that required intelligence when performed by people");
                c.setText("C) The art of creating programs that perform functions that required intelligence when performed by machines");
                d.setText("D) All of the above");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 42:
                Quest.setText(questions+". Select on or more of the applications of AI:");
                a.setText("A) Computer Vision");
                b.setText("B) Reasoning and Logic");
                c.setText("C) Speech Processing");
                d.setText("D) All of the above");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 43:
                Quest.setText(questions+". Select AI types:");
                a.setText("A) Narrow, General, Artificial");
                b.setText("B) Agile, Narrow, Super");
                c.setText("C) Super, Narrow, Agile");
                d.setText("D) Narrow, General, Agile");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 44:
                Quest.setText(questions+". Select the option that best describe supervise learning?");
                a.setText("A) The model learns from labeled data during the training phase");
                b.setText("B) The model learns from non-specific data during the training phase");
                c.setText("C) The model learns from labeled data during the Testing phase");
                d.setText("D) The model learns from labeled data during the UAT phase");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 45:
                Quest.setText(questions+". How does ML algorithms are categorized?");
                a.setText("A) Supervised Learning and Reinforcement learning ");
                b.setText("B) Reinforcement learning");
                c.setText("C) Unsupervised Learning, Supervise Learning");
                d.setText("D) Supervised Learning, Unsupervised Learning and Reinforcement Learning");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 46:
                Quest.setText(questions+". Select some common algorithms:");
                a.setText("A) Decision Tree");
                b.setText("B) Random Forest");
                c.setText("C) Support Vector Machine");
                d.setText("D) All of the above");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 47:
                Quest.setText(questions+". How Supervised Learning problem solved is divided?");
                a.setText("A) Classification and Retesting");
                b.setText("B) Classification and Regression");
                c.setText("C) Classification and Revision");
                d.setText("D) All of the above");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 48:
                Quest.setText(questions+". MAE is stand for?");
                a.setText("A) Mind Absolute errors");
                b.setText("B) Mean Absolute Error");
                c.setText("C) Meaning of Absolution Error");
                d.setText("D) None of the above");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 49:
                Quest.setText(questions+". Select which is true about Mean Absolute Error (MAE):");
                a.setText("A) Difference between predicated and actual values");
                b.setText("B) Difference between new data and stored data");
                c.setText("C) Difference between estimated data and actual value");
                d.setText("D) None of the above");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 50:
                Quest.setText(questions+". Select the most accurate definition of Unsupervised Learning:");
                a.setText("A) This is based on data labeled ");
                b.setText("B) This kind of ML where no labeled data is provided explicitly");
                c.setText("C) This kind of ML is for Data that is available all the time and easily labeled");
                d.setText("D) None of the above");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 51:
                Quest.setText(questions+". Which is true about Unsupervised Learning?");
                a.setText("A) Model learns alone");
                b.setText("B) Model needs training ");
                c.setText("C) Model learns with labels from data");
                d.setText("D) Not used in Pattern detection");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 52:
                Quest.setText(questions+". Select when Unsupervised Learning is used");
                a.setText("A) Computer Vision");
                b.setText("B) Exploratory Testing");
                c.setText("C) Pattern detection");
                d.setText("D) Descriptive modeling");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 53:
                Quest.setText(questions+". Unsupervised learning is classified in two methods, select them:");
                a.setText("A) Clustering and Labeled Data");
                b.setText("B) Clustering and Association");
                c.setText("C) Clustering and Recommendations");
                d.setText("D) None of the above");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 54:
                Quest.setText(questions+". RL is stand for?");
                a.setText("A) Red Learning");
                b.setText("B) Retention Learning");
                c.setText("C) Reinforcement Learning");
                d.setText("D) Reprocess Learning");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 55:
                Quest.setText(questions+". How RL works?");
                a.setText("A) The agent learns from the environment in an iterative manner ");
                b.setText("B) The agent learns from the programmer in an iterative manner ");
                c.setText("C) The agent study from the environment in an iterative manner");
                d.setText("D) None of the above");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 56:
                Quest.setText(questions+". Select an example when RL is used?");
                a.setText("A) a.\tRobotic vision ");
                b.setText("B) b.\tPattern detection");
                c.setText("C) c.\tVision improvements ");
                d.setText("D) d.\tMath solutions");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 57:
                Quest.setText(questions+". DL is stand for?");
                a.setText("A) Detail Learning");
                b.setText("B) Duplicate Learning");
                c.setText("C) Deep Learning");
                d.setText("D) Deeper Learning");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 58:
                Quest.setText(questions+". Main difference between ML and DL ");
                a.setText("A) In ML  feature extraction is automatic, DL detects the features manually");
                b.setText("B) In ML, feature extraction is manual whereas DL detects the features on its own");
                c.setText("C) In ML, testing is manual whereas DL is automatic");
                d.setText("D) All of the above");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 59:
                Quest.setText(questions+". ANN is stand for?");
                a.setText("A) Art Neural Net");
                b.setText("B) Artificial Neural Network");
                c.setText("C) Artificial Neural Neutral");
                d.setText("D) Artificial Network Neuron");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 60:
                Quest.setText(questions+". Neural Networks for DL are?");
                a.setText("A) CNN and SNN");
                b.setText("B) RNN and PNN");
                c.setText("C) CNN and RNN");
                d.setText("D) CNN and RNT");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 61:
                Quest.setText(questions+". CRISP-DM stand for");
                a.setText("A) The Cross Industry Standard Process for Data Mining");
                b.setText("B) The Code Industry Standard Process for Data Model");
                c.setText("C) The Cross Industry Stand Process for Data Mining");
                d.setText("D) The Cross Industry Standard Process for Data Model");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
            case 62:
                Quest.setText(questions+". Is CRISP-DM a process for ML lifecycle");
                a.setText("A) True");
                b.setText("B) False");
                c.setText("");
                d.setText("");
                c.setVisibility(View.GONE);
                d.setVisibility(View.GONE);
                break;
            case 63:
                Quest.setText(questions+". Which is not part of the CRISP-DM framework?");
                a.setText("A) Development");
                b.setText("B) Design");
                c.setText("C) Data Acquisition");
                d.setText("D) Optimization");
                c.setVisibility(View.VISIBLE);
                d.setVisibility(View.VISIBLE);
                break;
        }
    }
}
