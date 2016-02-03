package org.stellar.sdk.responses.effects;

import com.google.gson.annotations.SerializedName;

abstract class SignerEffect extends Effect {
  @SerializedName("weight")
  protected final Integer weight;
  @SerializedName("public_key")
  protected final String publicKey;

  public SignerEffect(Integer weight, String publicKey) {
    this.weight = weight;
    this.publicKey = publicKey;
  }

  public Integer getWeight() {
    return weight;
  }

  public String getPublicKey() {
    return publicKey;
  }
}