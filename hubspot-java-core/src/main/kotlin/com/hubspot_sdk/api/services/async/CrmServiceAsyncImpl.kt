// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.services.async.crm.AppUninstallServiceAsync
import com.hubspot_sdk.api.services.async.crm.AppUninstallServiceAsyncImpl
import com.hubspot_sdk.api.services.async.crm.AssociationServiceAsync
import com.hubspot_sdk.api.services.async.crm.AssociationServiceAsyncImpl
import com.hubspot_sdk.api.services.async.crm.ExportServiceAsync
import com.hubspot_sdk.api.services.async.crm.ExportServiceAsyncImpl
import com.hubspot_sdk.api.services.async.crm.ExtensionServiceAsync
import com.hubspot_sdk.api.services.async.crm.ExtensionServiceAsyncImpl
import com.hubspot_sdk.api.services.async.crm.FeatureFlagServiceAsync
import com.hubspot_sdk.api.services.async.crm.FeatureFlagServiceAsyncImpl
import com.hubspot_sdk.api.services.async.crm.ImportServiceAsync
import com.hubspot_sdk.api.services.async.crm.ImportServiceAsyncImpl
import com.hubspot_sdk.api.services.async.crm.LimitServiceAsync
import com.hubspot_sdk.api.services.async.crm.LimitServiceAsyncImpl
import com.hubspot_sdk.api.services.async.crm.ListServiceAsync
import com.hubspot_sdk.api.services.async.crm.ListServiceAsyncImpl
import com.hubspot_sdk.api.services.async.crm.ObjectLibraryServiceAsync
import com.hubspot_sdk.api.services.async.crm.ObjectLibraryServiceAsyncImpl
import com.hubspot_sdk.api.services.async.crm.ObjectServiceAsync
import com.hubspot_sdk.api.services.async.crm.ObjectServiceAsyncImpl
import com.hubspot_sdk.api.services.async.crm.OwnerServiceAsync
import com.hubspot_sdk.api.services.async.crm.OwnerServiceAsyncImpl
import com.hubspot_sdk.api.services.async.crm.PipelineServiceAsync
import com.hubspot_sdk.api.services.async.crm.PipelineServiceAsyncImpl
import com.hubspot_sdk.api.services.async.crm.PropertyServiceAsync
import com.hubspot_sdk.api.services.async.crm.PropertyServiceAsyncImpl
import com.hubspot_sdk.api.services.async.crm.PropertyValidationServiceAsync
import com.hubspot_sdk.api.services.async.crm.PropertyValidationServiceAsyncImpl
import com.hubspot_sdk.api.services.async.crm.SubscriptionServiceAsync
import com.hubspot_sdk.api.services.async.crm.SubscriptionServiceAsyncImpl
import com.hubspot_sdk.api.services.async.crm.TimelineServiceAsync
import com.hubspot_sdk.api.services.async.crm.TimelineServiceAsyncImpl
import com.hubspot_sdk.api.services.async.crm.UserServiceAsync
import com.hubspot_sdk.api.services.async.crm.UserServiceAsyncImpl
import java.util.function.Consumer

class CrmServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    CrmServiceAsync {

    private val withRawResponse: CrmServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val appUninstalls: AppUninstallServiceAsync by lazy {
        AppUninstallServiceAsyncImpl(clientOptions)
    }

    private val associations: AssociationServiceAsync by lazy {
        AssociationServiceAsyncImpl(clientOptions)
    }

    private val exports: ExportServiceAsync by lazy { ExportServiceAsyncImpl(clientOptions) }

    private val extensions: ExtensionServiceAsync by lazy {
        ExtensionServiceAsyncImpl(clientOptions)
    }

    private val featureFlags: FeatureFlagServiceAsync by lazy {
        FeatureFlagServiceAsyncImpl(clientOptions)
    }

    private val imports: ImportServiceAsync by lazy { ImportServiceAsyncImpl(clientOptions) }

    private val limits: LimitServiceAsync by lazy { LimitServiceAsyncImpl(clientOptions) }

    private val lists: ListServiceAsync by lazy { ListServiceAsyncImpl(clientOptions) }

    private val objectLibrary: ObjectLibraryServiceAsync by lazy {
        ObjectLibraryServiceAsyncImpl(clientOptions)
    }

    private val objects: ObjectServiceAsync by lazy { ObjectServiceAsyncImpl(clientOptions) }

    private val owners: OwnerServiceAsync by lazy { OwnerServiceAsyncImpl(clientOptions) }

    private val pipelines: PipelineServiceAsync by lazy { PipelineServiceAsyncImpl(clientOptions) }

    private val properties: PropertyServiceAsync by lazy { PropertyServiceAsyncImpl(clientOptions) }

    private val propertyValidations: PropertyValidationServiceAsync by lazy {
        PropertyValidationServiceAsyncImpl(clientOptions)
    }

    private val subscriptions: SubscriptionServiceAsync by lazy {
        SubscriptionServiceAsyncImpl(clientOptions)
    }

    private val timeline: TimelineServiceAsync by lazy { TimelineServiceAsyncImpl(clientOptions) }

    private val users: UserServiceAsync by lazy { UserServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): CrmServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CrmServiceAsync =
        CrmServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun appUninstalls(): AppUninstallServiceAsync = appUninstalls

    override fun associations(): AssociationServiceAsync = associations

    override fun exports(): ExportServiceAsync = exports

    override fun extensions(): ExtensionServiceAsync = extensions

    override fun featureFlags(): FeatureFlagServiceAsync = featureFlags

    override fun imports(): ImportServiceAsync = imports

    override fun limits(): LimitServiceAsync = limits

    override fun lists(): ListServiceAsync = lists

    override fun objectLibrary(): ObjectLibraryServiceAsync = objectLibrary

    override fun objects(): ObjectServiceAsync = objects

    override fun owners(): OwnerServiceAsync = owners

    override fun pipelines(): PipelineServiceAsync = pipelines

    override fun properties(): PropertyServiceAsync = properties

    override fun propertyValidations(): PropertyValidationServiceAsync = propertyValidations

    override fun subscriptions(): SubscriptionServiceAsync = subscriptions

    override fun timeline(): TimelineServiceAsync = timeline

    override fun users(): UserServiceAsync = users

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CrmServiceAsync.WithRawResponse {

        private val appUninstalls: AppUninstallServiceAsync.WithRawResponse by lazy {
            AppUninstallServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val associations: AssociationServiceAsync.WithRawResponse by lazy {
            AssociationServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val exports: ExportServiceAsync.WithRawResponse by lazy {
            ExportServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val extensions: ExtensionServiceAsync.WithRawResponse by lazy {
            ExtensionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val featureFlags: FeatureFlagServiceAsync.WithRawResponse by lazy {
            FeatureFlagServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val imports: ImportServiceAsync.WithRawResponse by lazy {
            ImportServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val limits: LimitServiceAsync.WithRawResponse by lazy {
            LimitServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val lists: ListServiceAsync.WithRawResponse by lazy {
            ListServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val objectLibrary: ObjectLibraryServiceAsync.WithRawResponse by lazy {
            ObjectLibraryServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val objects: ObjectServiceAsync.WithRawResponse by lazy {
            ObjectServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val owners: OwnerServiceAsync.WithRawResponse by lazy {
            OwnerServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val pipelines: PipelineServiceAsync.WithRawResponse by lazy {
            PipelineServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val properties: PropertyServiceAsync.WithRawResponse by lazy {
            PropertyServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val propertyValidations: PropertyValidationServiceAsync.WithRawResponse by lazy {
            PropertyValidationServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val subscriptions: SubscriptionServiceAsync.WithRawResponse by lazy {
            SubscriptionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val timeline: TimelineServiceAsync.WithRawResponse by lazy {
            TimelineServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val users: UserServiceAsync.WithRawResponse by lazy {
            UserServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CrmServiceAsync.WithRawResponse =
            CrmServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun appUninstalls(): AppUninstallServiceAsync.WithRawResponse = appUninstalls

        override fun associations(): AssociationServiceAsync.WithRawResponse = associations

        override fun exports(): ExportServiceAsync.WithRawResponse = exports

        override fun extensions(): ExtensionServiceAsync.WithRawResponse = extensions

        override fun featureFlags(): FeatureFlagServiceAsync.WithRawResponse = featureFlags

        override fun imports(): ImportServiceAsync.WithRawResponse = imports

        override fun limits(): LimitServiceAsync.WithRawResponse = limits

        override fun lists(): ListServiceAsync.WithRawResponse = lists

        override fun objectLibrary(): ObjectLibraryServiceAsync.WithRawResponse = objectLibrary

        override fun objects(): ObjectServiceAsync.WithRawResponse = objects

        override fun owners(): OwnerServiceAsync.WithRawResponse = owners

        override fun pipelines(): PipelineServiceAsync.WithRawResponse = pipelines

        override fun properties(): PropertyServiceAsync.WithRawResponse = properties

        override fun propertyValidations(): PropertyValidationServiceAsync.WithRawResponse =
            propertyValidations

        override fun subscriptions(): SubscriptionServiceAsync.WithRawResponse = subscriptions

        override fun timeline(): TimelineServiceAsync.WithRawResponse = timeline

        override fun users(): UserServiceAsync.WithRawResponse = users
    }
}
