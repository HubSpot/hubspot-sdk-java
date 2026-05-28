// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.proguard

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.client.okhttp.HubSpotOkHttpClient
import com.hubspot.sdk.core.jsonMapper
import com.hubspot.sdk.models.ObjectSubscriptionUpsertRequest
import com.hubspot.sdk.models.SubscriptionUpsertRequest
import com.hubspot.sdk.models.crm.objects.contacts.PublicGdprDeleteInput
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
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()

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
        assertThat(client.webhooksJournal()).isNotNull()
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
    fun subscriptionUpsertRequestRoundtrip() {
        val jsonMapper = jsonMapper()
        val subscriptionUpsertRequest =
            SubscriptionUpsertRequest.ofObject(
                ObjectSubscriptionUpsertRequest.builder()
                    .addAction(ObjectSubscriptionUpsertRequest.Action.CREATE)
                    .addObjectId(0L)
                    .objectTypeId("objectTypeId")
                    .portalId(0L)
                    .addProperty("string")
                    .subscriptionType(ObjectSubscriptionUpsertRequest.SubscriptionType.OBJECT)
                    .build()
            )

        val roundtrippedSubscriptionUpsertRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(subscriptionUpsertRequest),
                jacksonTypeRef<SubscriptionUpsertRequest>(),
            )

        assertThat(roundtrippedSubscriptionUpsertRequest).isEqualTo(subscriptionUpsertRequest)
    }
}
