// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.marketing.marketingevents.participations

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ParticipationGetByExternalAccountAndEventIdParamsTest {

    @Test
    fun create() {
        ParticipationGetByExternalAccountAndEventIdParams.builder()
            .externalAccountId("externalAccountId")
            .externalEventId("externalEventId")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ParticipationGetByExternalAccountAndEventIdParams.builder()
                .externalAccountId("externalAccountId")
                .externalEventId("externalEventId")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("externalAccountId")
        assertThat(params._pathParam(1)).isEqualTo("externalEventId")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
