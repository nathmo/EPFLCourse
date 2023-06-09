import numpy as np
import pandas as pd

# imports to set up plotting
import matplotlib.pyplot as plt
import seaborn as sns

# some nice visual settings
pd.set_option("display.precision", 2)

# graphics in the "retina" format are more sharp and legible
sns.set()
# config InlineBackend.figure_format = 'retina'

# setting the plot size and color scheme
plt.rcParams["figure.figsize"] = (7, 4)
plt.rcParams["image.cmap"] = "viridis"

df = pd.read_csv("telecom_churn.csv")
#df.head()

#df.shape

df.columns

#df.info()

#df.describe()

#print(df["State"].value_counts())
#internationalPlanAndSupport = df[(df["Churn"] == True) & (df["International plan"] == "Yes") & (df["Customer service calls"] >= 3)].shape[0] / df[(df["International plan"] == "Yes")].shape[0]
# print(df["Total day minutes"].median()) # mean = 179.7 min, med =179.4

#columns_to_show = ["Total eve minutes", "Total night minutes"]
#print(df.groupby(["Churn"])[columns_to_show].describe())
#print(df.groupby(["Churn"])[columns_to_show].agg([np.mean, np.std, np.min, np.max]))

#print(pd.crosstab(df["Churn"], df["Voice mail plan"], normalize=True))
#df["Many customer service calls"] = df["Customer service calls"] > 3
#print(pd.crosstab(df["Churn"], df["Many customer service calls"], margins=True))
#sns.countplot(x="Many customer service calls", hue="Churn", data=df).get_figure().savefig("out2.png")

#columns_to_show = ["Total day minutes", "Total intl calls"]
#(df[columns_to_show].hist(figsize=(9,3), bins=10))[0][0].get_figure().savefig('out30.png')
#(df[columns_to_show].hist(figsize=(9,3), bins=10))[0][1].get_figure().savefig('out31.png')
sns.scatterplot(data = df, x="Total day minutes", y="Total night minutes", hue="Churn").get_figure().savefig("out40.png")
sns.scatterplot(data = df, x="Total day minutes", y="Total night minutes", hue="Churn", size=1).get_figure().savefig("out41.png")