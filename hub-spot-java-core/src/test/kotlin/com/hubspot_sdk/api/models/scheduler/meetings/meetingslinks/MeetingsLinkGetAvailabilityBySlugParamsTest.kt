// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.scheduler.meetings.meetingslinks

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MeetingsLinkGetAvailabilityBySlugParamsTest {

    @Test
    fun create() {
        MeetingsLinkGetAvailabilityBySlugParams.builder().slug("slug").build()
    }

    @Test
    fun pathParams() {
        val params = MeetingsLinkGetAvailabilityBySlugParams.builder().slug("slug").build()

        assertThat(params._pathParam(0)).isEqualTo("slug")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
