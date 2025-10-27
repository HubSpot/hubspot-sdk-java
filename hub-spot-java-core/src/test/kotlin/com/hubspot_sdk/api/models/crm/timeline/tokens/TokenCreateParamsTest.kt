// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.timeline.tokens

import com.hubspot_sdk.api.models.crm.timeline.TimelineEventTemplateToken
import com.hubspot_sdk.api.models.crm.timeline.TimelineEventTemplateTokenOption
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TokenCreateParamsTest {

    @Test
    fun create() {
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
                        TimelineEventTemplateTokenOption.builder().label("Dog").value("dog").build()
                    )
                    .addOption(
                        TimelineEventTemplateTokenOption.builder().label("Cat").value("cat").build()
                    )
                    .updatedAt(OffsetDateTime.parse("2020-02-12T20:58:26Z"))
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            TokenCreateParams.builder()
                .appId(0)
                .eventTemplateId("eventTemplateId")
                .timelineEventTemplateToken(
                    TimelineEventTemplateToken.builder()
                        .label("Pet Type")
                        .name("petType")
                        .type(TimelineEventTemplateToken.Type.ENUMERATION)
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("0")
        assertThat(params._pathParam(1)).isEqualTo("eventTemplateId")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
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

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                TimelineEventTemplateToken.builder()
                    .label("Pet Type")
                    .name("petType")
                    .type(TimelineEventTemplateToken.Type.ENUMERATION)
                    .createdAt(OffsetDateTime.parse("2020-02-12T20:58:26Z"))
                    .objectPropertyName("customPropertyPetType")
                    .addOption(
                        TimelineEventTemplateTokenOption.builder().label("Dog").value("dog").build()
                    )
                    .addOption(
                        TimelineEventTemplateTokenOption.builder().label("Cat").value("cat").build()
                    )
                    .updatedAt(OffsetDateTime.parse("2020-02-12T20:58:26Z"))
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            TokenCreateParams.builder()
                .appId(0)
                .eventTemplateId("eventTemplateId")
                .timelineEventTemplateToken(
                    TimelineEventTemplateToken.builder()
                        .label("Pet Type")
                        .name("petType")
                        .type(TimelineEventTemplateToken.Type.ENUMERATION)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                TimelineEventTemplateToken.builder()
                    .label("Pet Type")
                    .name("petType")
                    .type(TimelineEventTemplateToken.Type.ENUMERATION)
                    .build()
            )
    }
}
