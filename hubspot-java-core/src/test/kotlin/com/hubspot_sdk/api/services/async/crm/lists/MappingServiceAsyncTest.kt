// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm.lists

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClientAsync
import com.hubspot_sdk.api.models.crm.lists.mapping.MappingBatchCreateIdMappingParams
import com.hubspot_sdk.api.models.crm.lists.mapping.MappingGetIdMappingParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class MappingServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun batchCreateIdMapping() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val mappingServiceAsync = client.crm().lists().mapping()

        val publicBatchMigrationMappingFuture =
            mappingServiceAsync.batchCreateIdMapping(
                MappingBatchCreateIdMappingParams.builder().addBody("string").build()
            )

        val publicBatchMigrationMapping = publicBatchMigrationMappingFuture.get()
        publicBatchMigrationMapping.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getIdMapping() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val mappingServiceAsync = client.crm().lists().mapping()

        val publicMigrationMappingFuture =
            mappingServiceAsync.getIdMapping(
                MappingGetIdMappingParams.builder().legacyListId("legacyListId").build()
            )

        val publicMigrationMapping = publicMigrationMappingFuture.get()
        publicMigrationMapping.validate()
    }
}
