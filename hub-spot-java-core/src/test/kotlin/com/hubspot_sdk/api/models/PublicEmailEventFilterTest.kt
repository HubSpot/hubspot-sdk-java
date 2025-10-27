// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicEmailEventFilterTest {

    @Test
    fun create() {
        val publicEmailEventFilter =
            PublicEmailEventFilter.builder()
                .appId("appId")
                .emailId("emailId")
                .filterType(PublicEmailEventFilter.FilterType.EMAIL_EVENT)
                .level("level")
                .operator(PublicEmailEventFilter.Operator.LINK_CLICKED)
                .clickUrl("clickUrl")
                .pruningRefineBy(
                    PublicNumOccurrencesRefineBy.builder()
                        .type(PublicNumOccurrencesRefineBy.Type.NUM_OCCURRENCES)
                        .maxOccurrences(0)
                        .minOccurrences(0)
                        .build()
                )
                .build()

        assertThat(publicEmailEventFilter.appId()).isEqualTo("appId")
        assertThat(publicEmailEventFilter.emailId()).isEqualTo("emailId")
        assertThat(publicEmailEventFilter.filterType())
            .isEqualTo(PublicEmailEventFilter.FilterType.EMAIL_EVENT)
        assertThat(publicEmailEventFilter.level()).isEqualTo("level")
        assertThat(publicEmailEventFilter.operator())
            .isEqualTo(PublicEmailEventFilter.Operator.LINK_CLICKED)
        assertThat(publicEmailEventFilter.clickUrl()).contains("clickUrl")
        assertThat(publicEmailEventFilter.pruningRefineBy())
            .contains(
                PublicEmailEventFilter.PruningRefineBy.ofPublicNumOccurrences(
                    PublicNumOccurrencesRefineBy.builder()
                        .type(PublicNumOccurrencesRefineBy.Type.NUM_OCCURRENCES)
                        .maxOccurrences(0)
                        .minOccurrences(0)
                        .build()
                )
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicEmailEventFilter =
            PublicEmailEventFilter.builder()
                .appId("appId")
                .emailId("emailId")
                .filterType(PublicEmailEventFilter.FilterType.EMAIL_EVENT)
                .level("level")
                .operator(PublicEmailEventFilter.Operator.LINK_CLICKED)
                .clickUrl("clickUrl")
                .pruningRefineBy(
                    PublicNumOccurrencesRefineBy.builder()
                        .type(PublicNumOccurrencesRefineBy.Type.NUM_OCCURRENCES)
                        .maxOccurrences(0)
                        .minOccurrences(0)
                        .build()
                )
                .build()

        val roundtrippedPublicEmailEventFilter =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicEmailEventFilter),
                jacksonTypeRef<PublicEmailEventFilter>(),
            )

        assertThat(roundtrippedPublicEmailEventFilter).isEqualTo(publicEmailEventFilter)
    }
}
