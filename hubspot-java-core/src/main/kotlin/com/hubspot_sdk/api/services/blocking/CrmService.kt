// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.services.blocking.crm.AppUninstallService
import com.hubspot_sdk.api.services.blocking.crm.AssociationService
import com.hubspot_sdk.api.services.blocking.crm.ExportService
import com.hubspot_sdk.api.services.blocking.crm.ExtensionService
import com.hubspot_sdk.api.services.blocking.crm.FeatureFlagService
import com.hubspot_sdk.api.services.blocking.crm.ImportService
import com.hubspot_sdk.api.services.blocking.crm.LimitService
import com.hubspot_sdk.api.services.blocking.crm.ListService
import com.hubspot_sdk.api.services.blocking.crm.ObjectLibraryService
import com.hubspot_sdk.api.services.blocking.crm.ObjectService
import com.hubspot_sdk.api.services.blocking.crm.OwnerService
import com.hubspot_sdk.api.services.blocking.crm.PipelineService
import com.hubspot_sdk.api.services.blocking.crm.PropertyService
import com.hubspot_sdk.api.services.blocking.crm.PropertyValidationService
import com.hubspot_sdk.api.services.blocking.crm.SubscriptionService
import com.hubspot_sdk.api.services.blocking.crm.TimelineService
import com.hubspot_sdk.api.services.blocking.crm.UserService
import java.util.function.Consumer

interface CrmService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CrmService

    fun appUninstalls(): AppUninstallService

    fun associations(): AssociationService

    fun exports(): ExportService

    fun extensions(): ExtensionService

    fun featureFlags(): FeatureFlagService

    fun imports(): ImportService

    fun limits(): LimitService

    fun lists(): ListService

    fun objectLibrary(): ObjectLibraryService

    fun objects(): ObjectService

    fun owners(): OwnerService

    fun pipelines(): PipelineService

    fun properties(): PropertyService

    fun propertyValidations(): PropertyValidationService

    fun subscriptions(): SubscriptionService

    fun timeline(): TimelineService

    fun users(): UserService

    /** A view of [CrmService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): CrmService.WithRawResponse

        fun appUninstalls(): AppUninstallService.WithRawResponse

        fun associations(): AssociationService.WithRawResponse

        fun exports(): ExportService.WithRawResponse

        fun extensions(): ExtensionService.WithRawResponse

        fun featureFlags(): FeatureFlagService.WithRawResponse

        fun imports(): ImportService.WithRawResponse

        fun limits(): LimitService.WithRawResponse

        fun lists(): ListService.WithRawResponse

        fun objectLibrary(): ObjectLibraryService.WithRawResponse

        fun objects(): ObjectService.WithRawResponse

        fun owners(): OwnerService.WithRawResponse

        fun pipelines(): PipelineService.WithRawResponse

        fun properties(): PropertyService.WithRawResponse

        fun propertyValidations(): PropertyValidationService.WithRawResponse

        fun subscriptions(): SubscriptionService.WithRawResponse

        fun timeline(): TimelineService.WithRawResponse

        fun users(): UserService.WithRawResponse
    }
}
