// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm.propertiesvalidations

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PropertiesValidationGetByObjectTypeIdParamsTest {

    @Test
    fun create() {
        PropertiesValidationGetByObjectTypeIdParams.builder().objectTypeId("objectTypeId").build()
    }

    @Test
    fun pathParams() {
        val params =
            PropertiesValidationGetByObjectTypeIdParams.builder()
                .objectTypeId("objectTypeId")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("objectTypeId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
