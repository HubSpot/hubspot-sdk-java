// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.auth.oauth

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SignedAccessTokenTest {

    @Test
    fun create() {
        val signedAccessToken =
            SignedAccessToken.builder()
                .appId(0)
                .expiresAt(0L)
                .hubId(0)
                .hublet("hublet")
                .installingUserId(0)
                .isPrivateDistribution(true)
                .isServiceAccount(true)
                .isUserLevel(true)
                .newSignature("newSignature")
                .scopes("scopes")
                .scopeToScopeGroupPks("scopeToScopeGroupPks")
                .signature("signature")
                .trialScopes("trialScopes")
                .trialScopeToScopeGroupPks("trialScopeToScopeGroupPks")
                .userId(0)
                .build()

        assertThat(signedAccessToken.appId()).isEqualTo(0)
        assertThat(signedAccessToken.expiresAt()).isEqualTo(0L)
        assertThat(signedAccessToken.hubId()).isEqualTo(0)
        assertThat(signedAccessToken.hublet()).isEqualTo("hublet")
        assertThat(signedAccessToken.installingUserId()).isEqualTo(0)
        assertThat(signedAccessToken.isPrivateDistribution()).isEqualTo(true)
        assertThat(signedAccessToken.isServiceAccount()).isEqualTo(true)
        assertThat(signedAccessToken.isUserLevel()).isEqualTo(true)
        assertThat(signedAccessToken.newSignature()).isEqualTo("newSignature")
        assertThat(signedAccessToken.scopes()).isEqualTo("scopes")
        assertThat(signedAccessToken.scopeToScopeGroupPks()).isEqualTo("scopeToScopeGroupPks")
        assertThat(signedAccessToken.signature()).isEqualTo("signature")
        assertThat(signedAccessToken.trialScopes()).isEqualTo("trialScopes")
        assertThat(signedAccessToken.trialScopeToScopeGroupPks())
            .isEqualTo("trialScopeToScopeGroupPks")
        assertThat(signedAccessToken.userId()).isEqualTo(0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val signedAccessToken =
            SignedAccessToken.builder()
                .appId(0)
                .expiresAt(0L)
                .hubId(0)
                .hublet("hublet")
                .installingUserId(0)
                .isPrivateDistribution(true)
                .isServiceAccount(true)
                .isUserLevel(true)
                .newSignature("newSignature")
                .scopes("scopes")
                .scopeToScopeGroupPks("scopeToScopeGroupPks")
                .signature("signature")
                .trialScopes("trialScopes")
                .trialScopeToScopeGroupPks("trialScopeToScopeGroupPks")
                .userId(0)
                .build()

        val roundtrippedSignedAccessToken =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(signedAccessToken),
                jacksonTypeRef<SignedAccessToken>(),
            )

        assertThat(roundtrippedSignedAccessToken).isEqualTo(signedAccessToken)
    }
}
