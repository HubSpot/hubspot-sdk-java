// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm.timeline

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubSpotOkHttpClientAsync
import com.hubspot_sdk.api.models.crm.timeline.TimelineEventTemplateToken
import com.hubspot_sdk.api.models.crm.timeline.TimelineEventTemplateTokenOption
import com.hubspot_sdk.api.models.crm.timeline.TimelineEventTemplateTokenUpdateRequest
import com.hubspot_sdk.api.models.crm.timeline.tokens.TokenCreateParams
import com.hubspot_sdk.api.models.crm.timeline.tokens.TokenDeleteParams
import com.hubspot_sdk.api.models.crm.timeline.tokens.TokenUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class TokenServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            HubSpotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val tokenServiceAsync = client.crm().timeline().tokens()

        val timelineEventTemplateTokenFuture =
            tokenServiceAsync.create(
                TokenCreateParams.builder()
                    .appId(0)
                    .eventTemplateId("eventTemplateId")
                    .timelineEventTemplateToken(
                        TimelineEventTemplateToken.builder()
                            .label("Pet Type")
                            .name("petType")
                            .type(TimelineEventTemplateToken.Type.ENUMERATION)
                            .createdAt(OffsetDateTime.parse("2020-02-12T20:58:26Z"))
                            .objectPropertyName("customPropertyPetType")
                            .addOption(
                                TimelineEventTemplateTokenOption.builder()
                                    .label("Dog")
                                    .value("dog")
                                    .build()
                            )
                            .addOption(
                                TimelineEventTemplateTokenOption.builder()
                                    .label("Cat")
                                    .value("cat")
                                    .build()
                            )
                            .updatedAt(OffsetDateTime.parse("2020-02-12T20:58:26Z"))
                            .build()
                    )
                    .build()
            )

        val timelineEventTemplateToken = timelineEventTemplateTokenFuture.get()
        timelineEventTemplateToken.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            HubSpotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val tokenServiceAsync = client.crm().timeline().tokens()

        val timelineEventTemplateTokenFuture =
            tokenServiceAsync.update(
                TokenUpdateParams.builder()
                    .appId(0)
                    .eventTemplateId("eventTemplateId")
                    .tokenName("tokenName")
                    .timelineEventTemplateTokenUpdateRequest(
                        TimelineEventTemplateTokenUpdateRequest.builder()
                            .label("petType edit")
                            .objectPropertyName("objectPropertyName")
                            .options(
                                listOf(
                                    TimelineEventTemplateTokenOption.builder()
                                        .label("Dog")
                                        .value("dog")
                                        .build(),
                                    TimelineEventTemplateTokenOption.builder()
                                        .label("Cat")
                                        .value("cat")
                                        .build(),
                                    TimelineEventTemplateTokenOption.builder()
                                        .label("Bird")
                                        .value("bird")
                                        .build(),
                                )
                            )
                            .build()
                    )
                    .build()
            )

        val timelineEventTemplateToken = timelineEventTemplateTokenFuture.get()
        timelineEventTemplateToken.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            HubSpotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val tokenServiceAsync = client.crm().timeline().tokens()

        val future =
            tokenServiceAsync.delete(
                TokenDeleteParams.builder()
                    .appId(0)
                    .eventTemplateId("eventTemplateId")
                    .tokenName("tokenName")
                    .build()
            )

        val response = future.get()
    }
}
