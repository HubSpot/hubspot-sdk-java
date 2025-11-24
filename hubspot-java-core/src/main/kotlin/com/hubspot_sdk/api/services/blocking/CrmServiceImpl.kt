// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.services.blocking.crm.AppUninstallService
import com.hubspot_sdk.api.services.blocking.crm.AppUninstallServiceImpl
import com.hubspot_sdk.api.services.blocking.crm.AssociationService
import com.hubspot_sdk.api.services.blocking.crm.AssociationServiceImpl
import com.hubspot_sdk.api.services.blocking.crm.ExportService
import com.hubspot_sdk.api.services.blocking.crm.ExportServiceImpl
import com.hubspot_sdk.api.services.blocking.crm.ExtensionService
import com.hubspot_sdk.api.services.blocking.crm.ExtensionServiceImpl
import com.hubspot_sdk.api.services.blocking.crm.FeatureFlagService
import com.hubspot_sdk.api.services.blocking.crm.FeatureFlagServiceImpl
import com.hubspot_sdk.api.services.blocking.crm.ImportService
import com.hubspot_sdk.api.services.blocking.crm.ImportServiceImpl
import com.hubspot_sdk.api.services.blocking.crm.LimitService
import com.hubspot_sdk.api.services.blocking.crm.LimitServiceImpl
import com.hubspot_sdk.api.services.blocking.crm.ListService
import com.hubspot_sdk.api.services.blocking.crm.ListServiceImpl
import com.hubspot_sdk.api.services.blocking.crm.ObjectLibraryService
import com.hubspot_sdk.api.services.blocking.crm.ObjectLibraryServiceImpl
import com.hubspot_sdk.api.services.blocking.crm.ObjectService
import com.hubspot_sdk.api.services.blocking.crm.ObjectServiceImpl
import com.hubspot_sdk.api.services.blocking.crm.OwnerService
import com.hubspot_sdk.api.services.blocking.crm.OwnerServiceImpl
import com.hubspot_sdk.api.services.blocking.crm.PipelineService
import com.hubspot_sdk.api.services.blocking.crm.PipelineServiceImpl
import com.hubspot_sdk.api.services.blocking.crm.PropertyService
import com.hubspot_sdk.api.services.blocking.crm.PropertyServiceImpl
import com.hubspot_sdk.api.services.blocking.crm.PropertyValidationService
import com.hubspot_sdk.api.services.blocking.crm.PropertyValidationServiceImpl
import com.hubspot_sdk.api.services.blocking.crm.SubscriptionService
import com.hubspot_sdk.api.services.blocking.crm.SubscriptionServiceImpl
import com.hubspot_sdk.api.services.blocking.crm.TimelineService
import com.hubspot_sdk.api.services.blocking.crm.TimelineServiceImpl
import com.hubspot_sdk.api.services.blocking.crm.UserService
import com.hubspot_sdk.api.services.blocking.crm.UserServiceImpl
import java.util.function.Consumer

class CrmServiceImpl internal constructor(private val clientOptions: ClientOptions) : CrmService {

    private val withRawResponse: CrmService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val appUninstalls: AppUninstallService by lazy {
        AppUninstallServiceImpl(clientOptions)
    }

    private val associations: AssociationService by lazy { AssociationServiceImpl(clientOptions) }

    private val exports: ExportService by lazy { ExportServiceImpl(clientOptions) }

    private val extensions: ExtensionService by lazy { ExtensionServiceImpl(clientOptions) }

    private val featureFlags: FeatureFlagService by lazy { FeatureFlagServiceImpl(clientOptions) }

    private val imports: ImportService by lazy { ImportServiceImpl(clientOptions) }

    private val limits: LimitService by lazy { LimitServiceImpl(clientOptions) }

    private val lists: ListService by lazy { ListServiceImpl(clientOptions) }

    private val objectLibrary: ObjectLibraryService by lazy {
        ObjectLibraryServiceImpl(clientOptions)
    }

    private val objects: ObjectService by lazy { ObjectServiceImpl(clientOptions) }

    private val owners: OwnerService by lazy { OwnerServiceImpl(clientOptions) }

    private val pipelines: PipelineService by lazy { PipelineServiceImpl(clientOptions) }

    private val properties: PropertyService by lazy { PropertyServiceImpl(clientOptions) }

    private val propertyValidations: PropertyValidationService by lazy {
        PropertyValidationServiceImpl(clientOptions)
    }

    private val subscriptions: SubscriptionService by lazy {
        SubscriptionServiceImpl(clientOptions)
    }

    private val timeline: TimelineService by lazy { TimelineServiceImpl(clientOptions) }

    private val users: UserService by lazy { UserServiceImpl(clientOptions) }

    override fun withRawResponse(): CrmService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CrmService =
        CrmServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun appUninstalls(): AppUninstallService = appUninstalls

    override fun associations(): AssociationService = associations

    override fun exports(): ExportService = exports

    override fun extensions(): ExtensionService = extensions

    override fun featureFlags(): FeatureFlagService = featureFlags

    override fun imports(): ImportService = imports

    override fun limits(): LimitService = limits

    override fun lists(): ListService = lists

    override fun objectLibrary(): ObjectLibraryService = objectLibrary

    override fun objects(): ObjectService = objects

    override fun owners(): OwnerService = owners

    override fun pipelines(): PipelineService = pipelines

    override fun properties(): PropertyService = properties

    override fun propertyValidations(): PropertyValidationService = propertyValidations

    override fun subscriptions(): SubscriptionService = subscriptions

    override fun timeline(): TimelineService = timeline

    override fun users(): UserService = users

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CrmService.WithRawResponse {

        private val appUninstalls: AppUninstallService.WithRawResponse by lazy {
            AppUninstallServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val associations: AssociationService.WithRawResponse by lazy {
            AssociationServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val exports: ExportService.WithRawResponse by lazy {
            ExportServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val extensions: ExtensionService.WithRawResponse by lazy {
            ExtensionServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val featureFlags: FeatureFlagService.WithRawResponse by lazy {
            FeatureFlagServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val imports: ImportService.WithRawResponse by lazy {
            ImportServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val limits: LimitService.WithRawResponse by lazy {
            LimitServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val lists: ListService.WithRawResponse by lazy {
            ListServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val objectLibrary: ObjectLibraryService.WithRawResponse by lazy {
            ObjectLibraryServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val objects: ObjectService.WithRawResponse by lazy {
            ObjectServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val owners: OwnerService.WithRawResponse by lazy {
            OwnerServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val pipelines: PipelineService.WithRawResponse by lazy {
            PipelineServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val properties: PropertyService.WithRawResponse by lazy {
            PropertyServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val propertyValidations: PropertyValidationService.WithRawResponse by lazy {
            PropertyValidationServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val subscriptions: SubscriptionService.WithRawResponse by lazy {
            SubscriptionServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val timeline: TimelineService.WithRawResponse by lazy {
            TimelineServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val users: UserService.WithRawResponse by lazy {
            UserServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CrmService.WithRawResponse =
            CrmServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun appUninstalls(): AppUninstallService.WithRawResponse = appUninstalls

        override fun associations(): AssociationService.WithRawResponse = associations

        override fun exports(): ExportService.WithRawResponse = exports

        override fun extensions(): ExtensionService.WithRawResponse = extensions

        override fun featureFlags(): FeatureFlagService.WithRawResponse = featureFlags

        override fun imports(): ImportService.WithRawResponse = imports

        override fun limits(): LimitService.WithRawResponse = limits

        override fun lists(): ListService.WithRawResponse = lists

        override fun objectLibrary(): ObjectLibraryService.WithRawResponse = objectLibrary

        override fun objects(): ObjectService.WithRawResponse = objects

        override fun owners(): OwnerService.WithRawResponse = owners

        override fun pipelines(): PipelineService.WithRawResponse = pipelines

        override fun properties(): PropertyService.WithRawResponse = properties

        override fun propertyValidations(): PropertyValidationService.WithRawResponse =
            propertyValidations

        override fun subscriptions(): SubscriptionService.WithRawResponse = subscriptions

        override fun timeline(): TimelineService.WithRawResponse = timeline

        override fun users(): UserService.WithRawResponse = users
    }
}
