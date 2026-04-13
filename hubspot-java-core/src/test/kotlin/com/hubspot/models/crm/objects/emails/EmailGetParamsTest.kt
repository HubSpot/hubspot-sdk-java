// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm.objects.emails

import com.hubspot.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EmailGetParamsTest {

    @Test
    fun create() {
        EmailGetParams.builder()
            .emailId("emailId")
            .archived(true)
            .addAssociation("string")
            .idProperty("idProperty")
            .addProperty("string")
            .addPropertiesWithHistory("string")
            .build()
    }

    @Test
    fun pathParams() {
        val params = EmailGetParams.builder().emailId("emailId").build()

        assertThat(params._pathParam(0)).isEqualTo("emailId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            EmailGetParams.builder()
                .emailId("emailId")
                .archived(true)
                .addAssociation("string")
                .idProperty("idProperty")
                .addProperty("string")
                .addPropertiesWithHistory("string")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("archived", "true")
                    .put("associations", listOf("string").joinToString(","))
                    .put("idProperty", "idProperty")
                    .put("properties", listOf("string").joinToString(","))
                    .put("propertiesWithHistory", listOf("string").joinToString(","))
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = EmailGetParams.builder().emailId("emailId").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
