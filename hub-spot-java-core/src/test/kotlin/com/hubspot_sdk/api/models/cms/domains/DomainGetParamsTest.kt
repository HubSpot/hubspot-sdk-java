// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.domains

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DomainGetParamsTest {

    @Test
    fun create() {
        DomainGetParams.builder().domainId("domainId").build()
    }

    @Test
    fun pathParams() {
        val params = DomainGetParams.builder().domainId("domainId").build()

        assertThat(params._pathParam(0)).isEqualTo("domainId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
