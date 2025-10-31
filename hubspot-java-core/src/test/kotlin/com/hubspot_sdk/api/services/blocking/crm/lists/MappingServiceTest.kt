// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm.lists

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClient
import com.hubspot_sdk.api.models.crm.lists.mapping.MappingBatchCreateIdMappingParams
import com.hubspot_sdk.api.models.crm.lists.mapping.MappingGetIdMappingParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class MappingServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun batchCreateIdMapping() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val mappingService = client.crm().lists().mapping()

        val publicBatchMigrationMapping =
            mappingService.batchCreateIdMapping(
                MappingBatchCreateIdMappingParams.builder().addBody("string").build()
            )

        publicBatchMigrationMapping.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getIdMapping() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val mappingService = client.crm().lists().mapping()

        val publicMigrationMapping =
            mappingService.getIdMapping(
                MappingGetIdMappingParams.builder().legacyListId("legacyListId").build()
            )

        publicMigrationMapping.validate()
    }
}
