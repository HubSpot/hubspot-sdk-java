// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.proguard

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClient
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import com.hubspot_sdk.api.models.ActionResponse
import com.hubspot_sdk.api.models.cms.mediabridge.CreateMbObjectRequest
import com.hubspot_sdk.api.models.cms.mediabridge.CreateVideoObjectRequest
import java.time.OffsetDateTime
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
        assertThat(client.appWebhooks()).isNotNull()
        assertThat(client.auth()).isNotNull()
        assertThat(client.automation()).isNotNull()
        assertThat(client.businessUnits()).isNotNull()
        assertThat(client.cms()).isNotNull()
        assertThat(client.communicationPreferences()).isNotNull()
        assertThat(client.conversations()).isNotNull()
        assertThat(client.crm()).isNotNull()
        assertThat(client.dataStudio()).isNotNull()
        assertThat(client.events()).isNotNull()
        assertThat(client.files()).isNotNull()
        assertThat(client.marketing()).isNotNull()
        assertThat(client.meta()).isNotNull()
        assertThat(client.scheduler()).isNotNull()
        assertThat(client.settings()).isNotNull()
    }

    @Test
    fun actionResponseRoundtrip() {
        val jsonMapper = jsonMapper()
        val actionResponse =
            ActionResponse.builder()
                .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(ActionResponse.Status.CANCELED)
                .links(
                    ActionResponse.Links.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .requestedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedActionResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(actionResponse),
                jacksonTypeRef<ActionResponse>(),
            )

        assertThat(roundtrippedActionResponse).isEqualTo(actionResponse)
    }

    @Test
    fun createMbObjectRequestRoundtrip() {
        val jsonMapper = jsonMapper()
        val createMbObjectRequest =
            CreateMbObjectRequest.ofVideo(
                CreateVideoObjectRequest.builder()
                    .mediaType(CreateVideoObjectRequest.MediaType.VIDEO)
                    .title("title")
                    .bearerToken("bearerToken")
                    .detailsPageLink("detailsPageLink")
                    .duration(0L)
                    .externalId("externalId")
                    .fileUrl("fileUrl")
                    .oembedUrl("oembedUrl")
                    .posterUrl("posterUrl")
                    .thumbnailUrl("thumbnailUrl")
                    .transcriptUrl("transcriptUrl")
                    .build()
            )

        val roundtrippedCreateMbObjectRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(createMbObjectRequest),
                jacksonTypeRef<CreateMbObjectRequest>(),
            )

        assertThat(roundtrippedCreateMbObjectRequest).isEqualTo(createMbObjectRequest)
    }
}
