// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.proguard

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClient
import com.hubspot_sdk.api.core.jsonMapper
import com.hubspot_sdk.api.models.auth.oauth.PublicAccessTokenInfoResponse
import com.hubspot_sdk.api.models.auth.oauth.SignedAccessToken
import com.hubspot_sdk.api.models.auth.oauth.TokenInfoResponseBaseIf
import com.hubspot_sdk.api.models.crm.objects.contacts.PublicGdprDeleteInput
import kotlin.reflect.full.memberFunctions
import kotlin.reflect.jvm.javaMethod
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProGuardCompatibilityTest {

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            // To debug that we're using the right JAR.
            val jarPath = this::class.java.getProtectionDomain().codeSource.location
            println("JAR being used: $jarPath")

            // We have to manually run the test methods instead of using the JUnit runner because it
            // seems impossible to get working with R8.
            val test = ProGuardCompatibilityTest()
            test::class
                .memberFunctions
                .asSequence()
                .filter { function ->
                    function.javaMethod?.isAnnotationPresent(Test::class.java) == true
                }
                .forEach { it.call(test) }
        }
    }

    @Test
    fun proguardRules() {
        val rulesFile =
            javaClass.classLoader.getResourceAsStream("META-INF/proguard/hubspot-java-core.pro")

        assertThat(rulesFile).isNotNull()
    }

    @Test
    fun client() {
        val client = HubspotOkHttpClient.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()

        assertThat(client).isNotNull()
        assertThat(client.account()).isNotNull()
        assertThat(client.auth()).isNotNull()
        assertThat(client.automation()).isNotNull()
        assertThat(client.businessUnits()).isNotNull()
        assertThat(client.cms()).isNotNull()
        assertThat(client.communicationPreferences()).isNotNull()
        assertThat(client.conversations()).isNotNull()
        assertThat(client.crm()).isNotNull()
        assertThat(client.events()).isNotNull()
        assertThat(client.files()).isNotNull()
        assertThat(client.marketing()).isNotNull()
        assertThat(client.meta()).isNotNull()
        assertThat(client.scheduler()).isNotNull()
        assertThat(client.settings()).isNotNull()
        assertThat(client.webhooks()).isNotNull()
    }

    @Test
    fun publicGdprDeleteInputRoundtrip() {
        val jsonMapper = jsonMapper()
        val publicGdprDeleteInput =
            PublicGdprDeleteInput.builder().objectId("objectId").idProperty("idProperty").build()

        val roundtrippedPublicGdprDeleteInput =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicGdprDeleteInput),
                jacksonTypeRef<PublicGdprDeleteInput>(),
            )

        assertThat(roundtrippedPublicGdprDeleteInput).isEqualTo(publicGdprDeleteInput)
    }

    @Test
    fun tokenInfoResponseBaseIfRoundtrip() {
        val jsonMapper = jsonMapper()
        val tokenInfoResponseBaseIf =
            TokenInfoResponseBaseIf.ofPublicAccessTokenInfoResponse(
                PublicAccessTokenInfoResponse.builder()
                    .token("token")
                    .active(true)
                    .appId(0)
                    .clientId("client_id")
                    .expiresIn(0)
                    .hubId(0)
                    .isPrivateDistribution(true)
                    .addScope("string")
                    .signedAccessToken(
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
                    )
                    .tokenType("token_type")
                    .tokenUse(PublicAccessTokenInfoResponse.TokenUse.ACCESS_TOKEN)
                    .userId(0)
                    .hubDomain("hub_domain")
                    .user("user")
                    .build()
            )

        val roundtrippedTokenInfoResponseBaseIf =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(tokenInfoResponseBaseIf),
                jacksonTypeRef<TokenInfoResponseBaseIf>(),
            )

        assertThat(roundtrippedTokenInfoResponseBaseIf).isEqualTo(tokenInfoResponseBaseIf)
    }
}
