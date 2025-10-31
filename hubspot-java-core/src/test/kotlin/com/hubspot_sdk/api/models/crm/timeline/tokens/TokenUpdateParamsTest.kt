// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.timeline.tokens

import com.hubspot_sdk.api.models.crm.timeline.TimelineEventTemplateTokenOption
import com.hubspot_sdk.api.models.crm.timeline.TimelineEventTemplateTokenUpdateRequest
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TokenUpdateParamsTest {

    @Test
    fun create() {
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
    }

    @Test
    fun pathParams() {
        val params =
            TokenUpdateParams.builder()
                .appId(0)
                .eventTemplateId("eventTemplateId")
                .tokenName("tokenName")
                .timelineEventTemplateTokenUpdateRequest(
                    TimelineEventTemplateTokenUpdateRequest.builder().label("petType edit").build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("0")
        assertThat(params._pathParam(1)).isEqualTo("eventTemplateId")
        assertThat(params._pathParam(2)).isEqualTo("tokenName")
        // out-of-bound path param
        assertThat(params._pathParam(3)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
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

        val body = params._body()

        assertThat(body)
            .isEqualTo(
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
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            TokenUpdateParams.builder()
                .appId(0)
                .eventTemplateId("eventTemplateId")
                .tokenName("tokenName")
                .timelineEventTemplateTokenUpdateRequest(
                    TimelineEventTemplateTokenUpdateRequest.builder().label("petType edit").build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                TimelineEventTemplateTokenUpdateRequest.builder().label("petType edit").build()
            )
    }
}
