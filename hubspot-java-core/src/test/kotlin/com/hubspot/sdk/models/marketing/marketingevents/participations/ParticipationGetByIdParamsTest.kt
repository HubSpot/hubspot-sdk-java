// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.marketing.marketingevents.participations

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ParticipationGetByIdParamsTest {

    @Test
    fun create() {
        ParticipationGetByIdParams.builder().marketingEventId(0L).build()
    }

    @Test
    fun pathParams() {
        val params = ParticipationGetByIdParams.builder().marketingEventId(0L).build()

        assertThat(params._pathParam(0)).isEqualTo("0")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
