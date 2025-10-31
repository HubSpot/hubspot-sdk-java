// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.propertyvalidations

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PropertyValidationListParamsTest {

    @Test
    fun create() {
        PropertyValidationListParams.builder().objectTypeId("objectTypeId").build()
    }

    @Test
    fun pathParams() {
        val params = PropertyValidationListParams.builder().objectTypeId("objectTypeId").build()

        assertThat(params._pathParam(0)).isEqualTo("objectTypeId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
