// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm.timeline

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.crm.timeline.CollectionResponseTimelineEventTemplateNoPaging
import com.hubspot_sdk.api.models.crm.timeline.TimelineEventTemplate
import com.hubspot_sdk.api.models.crm.timeline.templates.TemplateCreateParams
import com.hubspot_sdk.api.models.crm.timeline.templates.TemplateDeleteParams
import com.hubspot_sdk.api.models.crm.timeline.templates.TemplateGetParams
import com.hubspot_sdk.api.models.crm.timeline.templates.TemplateListParams
import com.hubspot_sdk.api.models.crm.timeline.templates.TemplateUpdateParams
import java.util.function.Consumer

interface TemplateService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TemplateService

    /**
     * Event templates define the general structure for a custom timeline event, and enable you to
     * send event data to HubSpot. A template includes formatted copy for its heading and details,
     * as well as any custom property definitions. A single app can include up to 750 event
     * templates.<br/><Warning>the `v1` and `v3` timeline events APIs are only available for app
     * partners with existing `v1`/`v3` timeline events defined in their public app. <ul><li>If your
     * app doesn't include any timeline events yet, requests to this endpoint will fail. Instead,
     * you can get started on
     * [latest version of the developer platform](/apps/developer-platform/build-apps/overview).
     * Note that you'll need to request approval before you can define app events for your app.
     * Learn more in the
     * [app events overview](/apps/developer-platform/add-features/app-events/overview).</li><li>If
     * your app includes a `v1`/`v3` timeline event, learn how to
     * [migrate it to the developer platform](/apps/developer-platform/add-features/app-events/create-and-manage-event-types#migrate-an-existing-timeline-event-type).
     * You don't need to request approval before migrating existing event types.</li></ul>If you're
     * not an app partner, you can send custom event data to HubSpot using the
     * [custom events API](/api-reference/events-manage-event-definitions-v3/guide).</Warning>
     */
    fun create(appId: Int, params: TemplateCreateParams): TimelineEventTemplate =
        create(appId, params, RequestOptions.none())

    /** @see create */
    fun create(
        appId: Int,
        params: TemplateCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TimelineEventTemplate = create(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see create */
    fun create(params: TemplateCreateParams): TimelineEventTemplate =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: TemplateCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TimelineEventTemplate

    /** Update an existing event template, specified by ID. */
    fun update(eventTemplateId: String, params: TemplateUpdateParams): TimelineEventTemplate =
        update(eventTemplateId, params, RequestOptions.none())

    /** @see update */
    fun update(
        eventTemplateId: String,
        params: TemplateUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TimelineEventTemplate =
        update(params.toBuilder().eventTemplateId(eventTemplateId).build(), requestOptions)

    /** @see update */
    fun update(params: TemplateUpdateParams): TimelineEventTemplate =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: TemplateUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TimelineEventTemplate

    /** Retrieve all templates defined for an app. */
    fun list(appId: Int): CollectionResponseTimelineEventTemplateNoPaging =
        list(appId, TemplateListParams.none())

    /** @see list */
    fun list(
        appId: Int,
        params: TemplateListParams = TemplateListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponseTimelineEventTemplateNoPaging =
        list(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see list */
    fun list(
        appId: Int,
        params: TemplateListParams = TemplateListParams.none(),
    ): CollectionResponseTimelineEventTemplateNoPaging = list(appId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: TemplateListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponseTimelineEventTemplateNoPaging

    /** @see list */
    fun list(params: TemplateListParams): CollectionResponseTimelineEventTemplateNoPaging =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        appId: Int,
        requestOptions: RequestOptions,
    ): CollectionResponseTimelineEventTemplateNoPaging =
        list(appId, TemplateListParams.none(), requestOptions)

    /** Delete an event type template by ID. */
    fun delete(eventTemplateId: String, params: TemplateDeleteParams) =
        delete(eventTemplateId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        eventTemplateId: String,
        params: TemplateDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().eventTemplateId(eventTemplateId).build(), requestOptions)

    /** @see delete */
    fun delete(params: TemplateDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(params: TemplateDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Retrieve an event type template by ID. */
    fun get(eventTemplateId: String, params: TemplateGetParams): TimelineEventTemplate =
        get(eventTemplateId, params, RequestOptions.none())

    /** @see get */
    fun get(
        eventTemplateId: String,
        params: TemplateGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TimelineEventTemplate =
        get(params.toBuilder().eventTemplateId(eventTemplateId).build(), requestOptions)

    /** @see get */
    fun get(params: TemplateGetParams): TimelineEventTemplate = get(params, RequestOptions.none())

    /** @see get */
    fun get(
        params: TemplateGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TimelineEventTemplate

    /** A view of [TemplateService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): TemplateService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /integrators/timeline/v3/{appId}/event-templates`,
         * but is otherwise the same as [TemplateService.create].
         */
        @MustBeClosed
        fun create(
            appId: Int,
            params: TemplateCreateParams,
        ): HttpResponseFor<TimelineEventTemplate> = create(appId, params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            appId: Int,
            params: TemplateCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TimelineEventTemplate> =
            create(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(params: TemplateCreateParams): HttpResponseFor<TimelineEventTemplate> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: TemplateCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TimelineEventTemplate>

        /**
         * Returns a raw HTTP response for `put
         * /integrators/timeline/v3/{appId}/event-templates/{eventTemplateId}`, but is otherwise the
         * same as [TemplateService.update].
         */
        @MustBeClosed
        fun update(
            eventTemplateId: String,
            params: TemplateUpdateParams,
        ): HttpResponseFor<TimelineEventTemplate> =
            update(eventTemplateId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            eventTemplateId: String,
            params: TemplateUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TimelineEventTemplate> =
            update(params.toBuilder().eventTemplateId(eventTemplateId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: TemplateUpdateParams): HttpResponseFor<TimelineEventTemplate> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: TemplateUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TimelineEventTemplate>

        /**
         * Returns a raw HTTP response for `get /integrators/timeline/v3/{appId}/event-templates`,
         * but is otherwise the same as [TemplateService.list].
         */
        @MustBeClosed
        fun list(appId: Int): HttpResponseFor<CollectionResponseTimelineEventTemplateNoPaging> =
            list(appId, TemplateListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            appId: Int,
            params: TemplateListParams = TemplateListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponseTimelineEventTemplateNoPaging> =
            list(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            appId: Int,
            params: TemplateListParams = TemplateListParams.none(),
        ): HttpResponseFor<CollectionResponseTimelineEventTemplateNoPaging> =
            list(appId, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: TemplateListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponseTimelineEventTemplateNoPaging>

        /** @see list */
        @MustBeClosed
        fun list(
            params: TemplateListParams
        ): HttpResponseFor<CollectionResponseTimelineEventTemplateNoPaging> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            appId: Int,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CollectionResponseTimelineEventTemplateNoPaging> =
            list(appId, TemplateListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /integrators/timeline/v3/{appId}/event-templates/{eventTemplateId}`, but is otherwise the
         * same as [TemplateService.delete].
         */
        @MustBeClosed
        fun delete(eventTemplateId: String, params: TemplateDeleteParams): HttpResponse =
            delete(eventTemplateId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            eventTemplateId: String,
            params: TemplateDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            delete(params.toBuilder().eventTemplateId(eventTemplateId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(params: TemplateDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: TemplateDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get
         * /integrators/timeline/v3/{appId}/event-templates/{eventTemplateId}`, but is otherwise the
         * same as [TemplateService.get].
         */
        @MustBeClosed
        fun get(
            eventTemplateId: String,
            params: TemplateGetParams,
        ): HttpResponseFor<TimelineEventTemplate> =
            get(eventTemplateId, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            eventTemplateId: String,
            params: TemplateGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TimelineEventTemplate> =
            get(params.toBuilder().eventTemplateId(eventTemplateId).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(params: TemplateGetParams): HttpResponseFor<TimelineEventTemplate> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: TemplateGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TimelineEventTemplate>
    }
}
