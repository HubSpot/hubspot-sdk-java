// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.marketing

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.AbTestCreateRequestVNext
import com.hubspot_sdk.api.models.marketing.emails.AggregateEmailStatistics
import com.hubspot_sdk.api.models.marketing.emails.CollectionResponseWithTotalEmailStatisticInterval
import com.hubspot_sdk.api.models.marketing.emails.EmailCloneParams
import com.hubspot_sdk.api.models.marketing.emails.EmailCloneRequestVNext
import com.hubspot_sdk.api.models.marketing.emails.EmailCreateAbTestVariationParams
import com.hubspot_sdk.api.models.marketing.emails.EmailCreateParams
import com.hubspot_sdk.api.models.marketing.emails.EmailCreateRequest
import com.hubspot_sdk.api.models.marketing.emails.EmailDeleteParams
import com.hubspot_sdk.api.models.marketing.emails.EmailGetAbTestVariationParams
import com.hubspot_sdk.api.models.marketing.emails.EmailGetDraftParams
import com.hubspot_sdk.api.models.marketing.emails.EmailGetHistogramParams
import com.hubspot_sdk.api.models.marketing.emails.EmailGetParams
import com.hubspot_sdk.api.models.marketing.emails.EmailGetRevisionParams
import com.hubspot_sdk.api.models.marketing.emails.EmailListPage
import com.hubspot_sdk.api.models.marketing.emails.EmailListParams
import com.hubspot_sdk.api.models.marketing.emails.EmailListRevisionsPage
import com.hubspot_sdk.api.models.marketing.emails.EmailListRevisionsParams
import com.hubspot_sdk.api.models.marketing.emails.EmailPublishParams
import com.hubspot_sdk.api.models.marketing.emails.EmailResetDraftParams
import com.hubspot_sdk.api.models.marketing.emails.EmailRestoreRevisionParams
import com.hubspot_sdk.api.models.marketing.emails.EmailRestoreRevisionToDraftParams
import com.hubspot_sdk.api.models.marketing.emails.EmailUnpublishParams
import com.hubspot_sdk.api.models.marketing.emails.EmailUpdateDraftParams
import com.hubspot_sdk.api.models.marketing.emails.EmailUpdateParams
import com.hubspot_sdk.api.models.marketing.emails.PublicEmail
import com.hubspot_sdk.api.models.marketing.emails.PublicEmailVersion
import java.util.function.Consumer

interface EmailService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): EmailService

    fun create(params: EmailCreateParams): PublicEmail = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: EmailCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicEmail

    /** @see create */
    fun create(
        emailCreateRequest: EmailCreateRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicEmail =
        create(
            EmailCreateParams.builder().emailCreateRequest(emailCreateRequest).build(),
            requestOptions,
        )

    /** @see create */
    fun create(emailCreateRequest: EmailCreateRequest): PublicEmail =
        create(emailCreateRequest, RequestOptions.none())

    /** Change properties of a marketing email. */
    fun update(emailId: String, params: EmailUpdateParams): PublicEmail =
        update(emailId, params, RequestOptions.none())

    /** @see update */
    fun update(
        emailId: String,
        params: EmailUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicEmail = update(params.toBuilder().emailId(emailId).build(), requestOptions)

    /** @see update */
    fun update(params: EmailUpdateParams): PublicEmail = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: EmailUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicEmail

    fun list(): EmailListPage = list(EmailListParams.none())

    /** @see list */
    fun list(
        params: EmailListParams = EmailListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EmailListPage

    /** @see list */
    fun list(params: EmailListParams = EmailListParams.none()): EmailListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): EmailListPage =
        list(EmailListParams.none(), requestOptions)

    /** Delete a marketing email by its ID */
    fun delete(emailId: String) = delete(emailId, EmailDeleteParams.none())

    /** @see delete */
    fun delete(
        emailId: String,
        params: EmailDeleteParams = EmailDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().emailId(emailId).build(), requestOptions)

    /** @see delete */
    fun delete(emailId: String, params: EmailDeleteParams = EmailDeleteParams.none()) =
        delete(emailId, params, RequestOptions.none())

    /** @see delete */
    fun delete(params: EmailDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: EmailDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(emailId: String, requestOptions: RequestOptions) =
        delete(emailId, EmailDeleteParams.none(), requestOptions)

    /**
     * This will create a duplicate email with the same properties as the original, with the
     * exception of a unique ID.
     */
    fun clone(params: EmailCloneParams): PublicEmail = clone(params, RequestOptions.none())

    /** @see clone */
    fun clone(
        params: EmailCloneParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicEmail

    /** @see clone */
    fun clone(
        emailCloneRequestVNext: EmailCloneRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicEmail =
        clone(
            EmailCloneParams.builder().emailCloneRequestVNext(emailCloneRequestVNext).build(),
            requestOptions,
        )

    /** @see clone */
    fun clone(emailCloneRequestVNext: EmailCloneRequestVNext): PublicEmail =
        clone(emailCloneRequestVNext, RequestOptions.none())

    /**
     * Create a variation of a marketing email for an A/B test. The new variation will be created as
     * a draft. If an active variation already exists, a new one won't be created.
     */
    fun createAbTestVariation(params: EmailCreateAbTestVariationParams): PublicEmail =
        createAbTestVariation(params, RequestOptions.none())

    /** @see createAbTestVariation */
    fun createAbTestVariation(
        params: EmailCreateAbTestVariationParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicEmail

    /** @see createAbTestVariation */
    fun createAbTestVariation(
        abTestCreateRequestVNext: AbTestCreateRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicEmail =
        createAbTestVariation(
            EmailCreateAbTestVariationParams.builder()
                .abTestCreateRequestVNext(abTestCreateRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see createAbTestVariation */
    fun createAbTestVariation(abTestCreateRequestVNext: AbTestCreateRequestVNext): PublicEmail =
        createAbTestVariation(abTestCreateRequestVNext, RequestOptions.none())

    /**
     * Use this endpoint to get aggregated statistics of emails sent in a specified time span. It
     * also returns the list of emails that were sent during the time span.
     */
    fun get(): AggregateEmailStatistics = get(EmailGetParams.none())

    /** @see get */
    fun get(
        params: EmailGetParams = EmailGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AggregateEmailStatistics

    /** @see get */
    fun get(params: EmailGetParams = EmailGetParams.none()): AggregateEmailStatistics =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(requestOptions: RequestOptions): AggregateEmailStatistics =
        get(EmailGetParams.none(), requestOptions)

    /**
     * This endpoint lets you obtain the variation of an A/B marketing email. If the email is
     * variation A (master) it will return variation B (variant) and vice versa.
     */
    fun getAbTestVariation(emailId: String): PublicEmail =
        getAbTestVariation(emailId, EmailGetAbTestVariationParams.none())

    /** @see getAbTestVariation */
    fun getAbTestVariation(
        emailId: String,
        params: EmailGetAbTestVariationParams = EmailGetAbTestVariationParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicEmail = getAbTestVariation(params.toBuilder().emailId(emailId).build(), requestOptions)

    /** @see getAbTestVariation */
    fun getAbTestVariation(
        emailId: String,
        params: EmailGetAbTestVariationParams = EmailGetAbTestVariationParams.none(),
    ): PublicEmail = getAbTestVariation(emailId, params, RequestOptions.none())

    /** @see getAbTestVariation */
    fun getAbTestVariation(
        params: EmailGetAbTestVariationParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicEmail

    /** @see getAbTestVariation */
    fun getAbTestVariation(params: EmailGetAbTestVariationParams): PublicEmail =
        getAbTestVariation(params, RequestOptions.none())

    /** @see getAbTestVariation */
    fun getAbTestVariation(emailId: String, requestOptions: RequestOptions): PublicEmail =
        getAbTestVariation(emailId, EmailGetAbTestVariationParams.none(), requestOptions)

    /**
     * Get the draft version of an email (if it exists). If no draft version exists, the published
     * email is returned.
     */
    fun getDraft(emailId: String): PublicEmail = getDraft(emailId, EmailGetDraftParams.none())

    /** @see getDraft */
    fun getDraft(
        emailId: String,
        params: EmailGetDraftParams = EmailGetDraftParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicEmail = getDraft(params.toBuilder().emailId(emailId).build(), requestOptions)

    /** @see getDraft */
    fun getDraft(
        emailId: String,
        params: EmailGetDraftParams = EmailGetDraftParams.none(),
    ): PublicEmail = getDraft(emailId, params, RequestOptions.none())

    /** @see getDraft */
    fun getDraft(
        params: EmailGetDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicEmail

    /** @see getDraft */
    fun getDraft(params: EmailGetDraftParams): PublicEmail = getDraft(params, RequestOptions.none())

    /** @see getDraft */
    fun getDraft(emailId: String, requestOptions: RequestOptions): PublicEmail =
        getDraft(emailId, EmailGetDraftParams.none(), requestOptions)

    /**
     * Get aggregated statistics in intervals for a specified time span. Each interval contains
     * aggregated statistics of the emails that were sent in that time.
     */
    fun getHistogram(): CollectionResponseWithTotalEmailStatisticInterval =
        getHistogram(EmailGetHistogramParams.none())

    /** @see getHistogram */
    fun getHistogram(
        params: EmailGetHistogramParams = EmailGetHistogramParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponseWithTotalEmailStatisticInterval

    /** @see getHistogram */
    fun getHistogram(
        params: EmailGetHistogramParams = EmailGetHistogramParams.none()
    ): CollectionResponseWithTotalEmailStatisticInterval =
        getHistogram(params, RequestOptions.none())

    /** @see getHistogram */
    fun getHistogram(
        requestOptions: RequestOptions
    ): CollectionResponseWithTotalEmailStatisticInterval =
        getHistogram(EmailGetHistogramParams.none(), requestOptions)

    /** Get a specific revision of a marketing email. */
    fun getRevision(revisionId: String, params: EmailGetRevisionParams): PublicEmailVersion =
        getRevision(revisionId, params, RequestOptions.none())

    /** @see getRevision */
    fun getRevision(
        revisionId: String,
        params: EmailGetRevisionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicEmailVersion =
        getRevision(params.toBuilder().revisionId(revisionId).build(), requestOptions)

    /** @see getRevision */
    fun getRevision(params: EmailGetRevisionParams): PublicEmailVersion =
        getRevision(params, RequestOptions.none())

    /** @see getRevision */
    fun getRevision(
        params: EmailGetRevisionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicEmailVersion

    /**
     * Get a list of all versions of a marketing email, with each entry including the full state of
     * that particular version. To view the most recent version, sort by the updatedAt parameter.
     */
    fun listRevisions(emailId: String): EmailListRevisionsPage =
        listRevisions(emailId, EmailListRevisionsParams.none())

    /** @see listRevisions */
    fun listRevisions(
        emailId: String,
        params: EmailListRevisionsParams = EmailListRevisionsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EmailListRevisionsPage =
        listRevisions(params.toBuilder().emailId(emailId).build(), requestOptions)

    /** @see listRevisions */
    fun listRevisions(
        emailId: String,
        params: EmailListRevisionsParams = EmailListRevisionsParams.none(),
    ): EmailListRevisionsPage = listRevisions(emailId, params, RequestOptions.none())

    /** @see listRevisions */
    fun listRevisions(
        params: EmailListRevisionsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EmailListRevisionsPage

    /** @see listRevisions */
    fun listRevisions(params: EmailListRevisionsParams): EmailListRevisionsPage =
        listRevisions(params, RequestOptions.none())

    /** @see listRevisions */
    fun listRevisions(emailId: String, requestOptions: RequestOptions): EmailListRevisionsPage =
        listRevisions(emailId, EmailListRevisionsParams.none(), requestOptions)

    /**
     * If you have a Marketing Hub Enterprise account or the transactional email add-on, you can use
     * this endpoint to publish an automated email or send/schedule a regular email.
     */
    fun publish(emailId: String) = publish(emailId, EmailPublishParams.none())

    /** @see publish */
    fun publish(
        emailId: String,
        params: EmailPublishParams = EmailPublishParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = publish(params.toBuilder().emailId(emailId).build(), requestOptions)

    /** @see publish */
    fun publish(emailId: String, params: EmailPublishParams = EmailPublishParams.none()) =
        publish(emailId, params, RequestOptions.none())

    /** @see publish */
    fun publish(params: EmailPublishParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see publish */
    fun publish(params: EmailPublishParams) = publish(params, RequestOptions.none())

    /** @see publish */
    fun publish(emailId: String, requestOptions: RequestOptions) =
        publish(emailId, EmailPublishParams.none(), requestOptions)

    /** Resets the draft back to a copy of the live object. */
    fun resetDraft(emailId: String) = resetDraft(emailId, EmailResetDraftParams.none())

    /** @see resetDraft */
    fun resetDraft(
        emailId: String,
        params: EmailResetDraftParams = EmailResetDraftParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = resetDraft(params.toBuilder().emailId(emailId).build(), requestOptions)

    /** @see resetDraft */
    fun resetDraft(emailId: String, params: EmailResetDraftParams = EmailResetDraftParams.none()) =
        resetDraft(emailId, params, RequestOptions.none())

    /** @see resetDraft */
    fun resetDraft(
        params: EmailResetDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see resetDraft */
    fun resetDraft(params: EmailResetDraftParams) = resetDraft(params, RequestOptions.none())

    /** @see resetDraft */
    fun resetDraft(emailId: String, requestOptions: RequestOptions) =
        resetDraft(emailId, EmailResetDraftParams.none(), requestOptions)

    /**
     * Restores a previous revision of a marketing email. The current revision becomes old, and the
     * restored revision is given a new version number.
     */
    fun restoreRevision(revisionId: String, params: EmailRestoreRevisionParams) =
        restoreRevision(revisionId, params, RequestOptions.none())

    /** @see restoreRevision */
    fun restoreRevision(
        revisionId: String,
        params: EmailRestoreRevisionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = restoreRevision(params.toBuilder().revisionId(revisionId).build(), requestOptions)

    /** @see restoreRevision */
    fun restoreRevision(params: EmailRestoreRevisionParams) =
        restoreRevision(params, RequestOptions.none())

    /** @see restoreRevision */
    fun restoreRevision(
        params: EmailRestoreRevisionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Restores a previous revision of a marketing email to DRAFT state. If there is currently
     * something in the draft for that object, it is overwritten.
     */
    fun restoreRevisionToDraft(
        revisionId: Long,
        params: EmailRestoreRevisionToDraftParams,
    ): PublicEmail = restoreRevisionToDraft(revisionId, params, RequestOptions.none())

    /** @see restoreRevisionToDraft */
    fun restoreRevisionToDraft(
        revisionId: Long,
        params: EmailRestoreRevisionToDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicEmail =
        restoreRevisionToDraft(params.toBuilder().revisionId(revisionId).build(), requestOptions)

    /** @see restoreRevisionToDraft */
    fun restoreRevisionToDraft(params: EmailRestoreRevisionToDraftParams): PublicEmail =
        restoreRevisionToDraft(params, RequestOptions.none())

    /** @see restoreRevisionToDraft */
    fun restoreRevisionToDraft(
        params: EmailRestoreRevisionToDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicEmail

    /**
     * If you have a Marketing Hub Enterprise account or the transactional email add-on, you can use
     * this endpoint to unpublish an automated email or cancel a regular email. If the email is
     * already in the process of being sent, canceling might not be possible.
     */
    fun unpublish(emailId: String) = unpublish(emailId, EmailUnpublishParams.none())

    /** @see unpublish */
    fun unpublish(
        emailId: String,
        params: EmailUnpublishParams = EmailUnpublishParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = unpublish(params.toBuilder().emailId(emailId).build(), requestOptions)

    /** @see unpublish */
    fun unpublish(emailId: String, params: EmailUnpublishParams = EmailUnpublishParams.none()) =
        unpublish(emailId, params, RequestOptions.none())

    /** @see unpublish */
    fun unpublish(
        params: EmailUnpublishParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see unpublish */
    fun unpublish(params: EmailUnpublishParams) = unpublish(params, RequestOptions.none())

    /** @see unpublish */
    fun unpublish(emailId: String, requestOptions: RequestOptions) =
        unpublish(emailId, EmailUnpublishParams.none(), requestOptions)

    /**
     * Create or update the draft version of a marketing email. If no draft exists, the system
     * creates a draft from the current “live” email then applies the request body to that draft.
     * The draft version only lives on the buffer—the email is not cloned.
     */
    fun updateDraft(emailId: String, params: EmailUpdateDraftParams): PublicEmail =
        updateDraft(emailId, params, RequestOptions.none())

    /** @see updateDraft */
    fun updateDraft(
        emailId: String,
        params: EmailUpdateDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicEmail = updateDraft(params.toBuilder().emailId(emailId).build(), requestOptions)

    /** @see updateDraft */
    fun updateDraft(params: EmailUpdateDraftParams): PublicEmail =
        updateDraft(params, RequestOptions.none())

    /** @see updateDraft */
    fun updateDraft(
        params: EmailUpdateDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicEmail

    /** A view of [EmailService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): EmailService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /marketing/emails/2026-03`, but is otherwise the
         * same as [EmailService.create].
         */
        @MustBeClosed
        fun create(params: EmailCreateParams): HttpResponseFor<PublicEmail> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: EmailCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicEmail>

        /** @see create */
        @MustBeClosed
        fun create(
            emailCreateRequest: EmailCreateRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicEmail> =
            create(
                EmailCreateParams.builder().emailCreateRequest(emailCreateRequest).build(),
                requestOptions,
            )

        /** @see create */
        @MustBeClosed
        fun create(emailCreateRequest: EmailCreateRequest): HttpResponseFor<PublicEmail> =
            create(emailCreateRequest, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `patch /marketing/emails/2026-03/{emailId}`, but is
         * otherwise the same as [EmailService.update].
         */
        @MustBeClosed
        fun update(emailId: String, params: EmailUpdateParams): HttpResponseFor<PublicEmail> =
            update(emailId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            emailId: String,
            params: EmailUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicEmail> =
            update(params.toBuilder().emailId(emailId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: EmailUpdateParams): HttpResponseFor<PublicEmail> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: EmailUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicEmail>

        /**
         * Returns a raw HTTP response for `get /marketing/emails/2026-03`, but is otherwise the
         * same as [EmailService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<EmailListPage> = list(EmailListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: EmailListParams = EmailListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EmailListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: EmailListParams = EmailListParams.none()): HttpResponseFor<EmailListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<EmailListPage> =
            list(EmailListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /marketing/emails/2026-03/{emailId}`, but is
         * otherwise the same as [EmailService.delete].
         */
        @MustBeClosed
        fun delete(emailId: String): HttpResponse = delete(emailId, EmailDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            emailId: String,
            params: EmailDeleteParams = EmailDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().emailId(emailId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            emailId: String,
            params: EmailDeleteParams = EmailDeleteParams.none(),
        ): HttpResponse = delete(emailId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: EmailDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: EmailDeleteParams): HttpResponse = delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(emailId: String, requestOptions: RequestOptions): HttpResponse =
            delete(emailId, EmailDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /marketing/emails/2026-03/clone`, but is otherwise
         * the same as [EmailService.clone].
         */
        @MustBeClosed
        fun clone(params: EmailCloneParams): HttpResponseFor<PublicEmail> =
            clone(params, RequestOptions.none())

        /** @see clone */
        @MustBeClosed
        fun clone(
            params: EmailCloneParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicEmail>

        /** @see clone */
        @MustBeClosed
        fun clone(
            emailCloneRequestVNext: EmailCloneRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicEmail> =
            clone(
                EmailCloneParams.builder().emailCloneRequestVNext(emailCloneRequestVNext).build(),
                requestOptions,
            )

        /** @see clone */
        @MustBeClosed
        fun clone(emailCloneRequestVNext: EmailCloneRequestVNext): HttpResponseFor<PublicEmail> =
            clone(emailCloneRequestVNext, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post
         * /marketing/emails/2026-03/ab-test/create-variation`, but is otherwise the same as
         * [EmailService.createAbTestVariation].
         */
        @MustBeClosed
        fun createAbTestVariation(
            params: EmailCreateAbTestVariationParams
        ): HttpResponseFor<PublicEmail> = createAbTestVariation(params, RequestOptions.none())

        /** @see createAbTestVariation */
        @MustBeClosed
        fun createAbTestVariation(
            params: EmailCreateAbTestVariationParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicEmail>

        /** @see createAbTestVariation */
        @MustBeClosed
        fun createAbTestVariation(
            abTestCreateRequestVNext: AbTestCreateRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicEmail> =
            createAbTestVariation(
                EmailCreateAbTestVariationParams.builder()
                    .abTestCreateRequestVNext(abTestCreateRequestVNext)
                    .build(),
                requestOptions,
            )

        /** @see createAbTestVariation */
        @MustBeClosed
        fun createAbTestVariation(
            abTestCreateRequestVNext: AbTestCreateRequestVNext
        ): HttpResponseFor<PublicEmail> =
            createAbTestVariation(abTestCreateRequestVNext, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get /marketing/emails/2026-03/statistics/list`, but is
         * otherwise the same as [EmailService.get].
         */
        @MustBeClosed
        fun get(): HttpResponseFor<AggregateEmailStatistics> = get(EmailGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: EmailGetParams = EmailGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AggregateEmailStatistics>

        /** @see get */
        @MustBeClosed
        fun get(
            params: EmailGetParams = EmailGetParams.none()
        ): HttpResponseFor<AggregateEmailStatistics> = get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(requestOptions: RequestOptions): HttpResponseFor<AggregateEmailStatistics> =
            get(EmailGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /marketing/emails/2026-03/{emailId}/ab-test/get-variation`, but is otherwise the same as
         * [EmailService.getAbTestVariation].
         */
        @MustBeClosed
        fun getAbTestVariation(emailId: String): HttpResponseFor<PublicEmail> =
            getAbTestVariation(emailId, EmailGetAbTestVariationParams.none())

        /** @see getAbTestVariation */
        @MustBeClosed
        fun getAbTestVariation(
            emailId: String,
            params: EmailGetAbTestVariationParams = EmailGetAbTestVariationParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicEmail> =
            getAbTestVariation(params.toBuilder().emailId(emailId).build(), requestOptions)

        /** @see getAbTestVariation */
        @MustBeClosed
        fun getAbTestVariation(
            emailId: String,
            params: EmailGetAbTestVariationParams = EmailGetAbTestVariationParams.none(),
        ): HttpResponseFor<PublicEmail> = getAbTestVariation(emailId, params, RequestOptions.none())

        /** @see getAbTestVariation */
        @MustBeClosed
        fun getAbTestVariation(
            params: EmailGetAbTestVariationParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicEmail>

        /** @see getAbTestVariation */
        @MustBeClosed
        fun getAbTestVariation(
            params: EmailGetAbTestVariationParams
        ): HttpResponseFor<PublicEmail> = getAbTestVariation(params, RequestOptions.none())

        /** @see getAbTestVariation */
        @MustBeClosed
        fun getAbTestVariation(
            emailId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PublicEmail> =
            getAbTestVariation(emailId, EmailGetAbTestVariationParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /marketing/emails/2026-03/{emailId}/draft`, but is
         * otherwise the same as [EmailService.getDraft].
         */
        @MustBeClosed
        fun getDraft(emailId: String): HttpResponseFor<PublicEmail> =
            getDraft(emailId, EmailGetDraftParams.none())

        /** @see getDraft */
        @MustBeClosed
        fun getDraft(
            emailId: String,
            params: EmailGetDraftParams = EmailGetDraftParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicEmail> =
            getDraft(params.toBuilder().emailId(emailId).build(), requestOptions)

        /** @see getDraft */
        @MustBeClosed
        fun getDraft(
            emailId: String,
            params: EmailGetDraftParams = EmailGetDraftParams.none(),
        ): HttpResponseFor<PublicEmail> = getDraft(emailId, params, RequestOptions.none())

        /** @see getDraft */
        @MustBeClosed
        fun getDraft(
            params: EmailGetDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicEmail>

        /** @see getDraft */
        @MustBeClosed
        fun getDraft(params: EmailGetDraftParams): HttpResponseFor<PublicEmail> =
            getDraft(params, RequestOptions.none())

        /** @see getDraft */
        @MustBeClosed
        fun getDraft(
            emailId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PublicEmail> =
            getDraft(emailId, EmailGetDraftParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /marketing/emails/2026-03/statistics/histogram`, but
         * is otherwise the same as [EmailService.getHistogram].
         */
        @MustBeClosed
        fun getHistogram(): HttpResponseFor<CollectionResponseWithTotalEmailStatisticInterval> =
            getHistogram(EmailGetHistogramParams.none())

        /** @see getHistogram */
        @MustBeClosed
        fun getHistogram(
            params: EmailGetHistogramParams = EmailGetHistogramParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponseWithTotalEmailStatisticInterval>

        /** @see getHistogram */
        @MustBeClosed
        fun getHistogram(
            params: EmailGetHistogramParams = EmailGetHistogramParams.none()
        ): HttpResponseFor<CollectionResponseWithTotalEmailStatisticInterval> =
            getHistogram(params, RequestOptions.none())

        /** @see getHistogram */
        @MustBeClosed
        fun getHistogram(
            requestOptions: RequestOptions
        ): HttpResponseFor<CollectionResponseWithTotalEmailStatisticInterval> =
            getHistogram(EmailGetHistogramParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /marketing/emails/2026-03/{emailId}/revisions/{revisionId}`, but is otherwise the same as
         * [EmailService.getRevision].
         */
        @MustBeClosed
        fun getRevision(
            revisionId: String,
            params: EmailGetRevisionParams,
        ): HttpResponseFor<PublicEmailVersion> =
            getRevision(revisionId, params, RequestOptions.none())

        /** @see getRevision */
        @MustBeClosed
        fun getRevision(
            revisionId: String,
            params: EmailGetRevisionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicEmailVersion> =
            getRevision(params.toBuilder().revisionId(revisionId).build(), requestOptions)

        /** @see getRevision */
        @MustBeClosed
        fun getRevision(params: EmailGetRevisionParams): HttpResponseFor<PublicEmailVersion> =
            getRevision(params, RequestOptions.none())

        /** @see getRevision */
        @MustBeClosed
        fun getRevision(
            params: EmailGetRevisionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicEmailVersion>

        /**
         * Returns a raw HTTP response for `get /marketing/emails/2026-03/{emailId}/revisions`, but
         * is otherwise the same as [EmailService.listRevisions].
         */
        @MustBeClosed
        fun listRevisions(emailId: String): HttpResponseFor<EmailListRevisionsPage> =
            listRevisions(emailId, EmailListRevisionsParams.none())

        /** @see listRevisions */
        @MustBeClosed
        fun listRevisions(
            emailId: String,
            params: EmailListRevisionsParams = EmailListRevisionsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EmailListRevisionsPage> =
            listRevisions(params.toBuilder().emailId(emailId).build(), requestOptions)

        /** @see listRevisions */
        @MustBeClosed
        fun listRevisions(
            emailId: String,
            params: EmailListRevisionsParams = EmailListRevisionsParams.none(),
        ): HttpResponseFor<EmailListRevisionsPage> =
            listRevisions(emailId, params, RequestOptions.none())

        /** @see listRevisions */
        @MustBeClosed
        fun listRevisions(
            params: EmailListRevisionsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EmailListRevisionsPage>

        /** @see listRevisions */
        @MustBeClosed
        fun listRevisions(
            params: EmailListRevisionsParams
        ): HttpResponseFor<EmailListRevisionsPage> = listRevisions(params, RequestOptions.none())

        /** @see listRevisions */
        @MustBeClosed
        fun listRevisions(
            emailId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EmailListRevisionsPage> =
            listRevisions(emailId, EmailListRevisionsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /marketing/emails/2026-03/{emailId}/publish`, but
         * is otherwise the same as [EmailService.publish].
         */
        @MustBeClosed
        fun publish(emailId: String): HttpResponse = publish(emailId, EmailPublishParams.none())

        /** @see publish */
        @MustBeClosed
        fun publish(
            emailId: String,
            params: EmailPublishParams = EmailPublishParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = publish(params.toBuilder().emailId(emailId).build(), requestOptions)

        /** @see publish */
        @MustBeClosed
        fun publish(
            emailId: String,
            params: EmailPublishParams = EmailPublishParams.none(),
        ): HttpResponse = publish(emailId, params, RequestOptions.none())

        /** @see publish */
        @MustBeClosed
        fun publish(
            params: EmailPublishParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see publish */
        @MustBeClosed
        fun publish(params: EmailPublishParams): HttpResponse =
            publish(params, RequestOptions.none())

        /** @see publish */
        @MustBeClosed
        fun publish(emailId: String, requestOptions: RequestOptions): HttpResponse =
            publish(emailId, EmailPublishParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /marketing/emails/2026-03/{emailId}/draft/reset`,
         * but is otherwise the same as [EmailService.resetDraft].
         */
        @MustBeClosed
        fun resetDraft(emailId: String): HttpResponse =
            resetDraft(emailId, EmailResetDraftParams.none())

        /** @see resetDraft */
        @MustBeClosed
        fun resetDraft(
            emailId: String,
            params: EmailResetDraftParams = EmailResetDraftParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = resetDraft(params.toBuilder().emailId(emailId).build(), requestOptions)

        /** @see resetDraft */
        @MustBeClosed
        fun resetDraft(
            emailId: String,
            params: EmailResetDraftParams = EmailResetDraftParams.none(),
        ): HttpResponse = resetDraft(emailId, params, RequestOptions.none())

        /** @see resetDraft */
        @MustBeClosed
        fun resetDraft(
            params: EmailResetDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see resetDraft */
        @MustBeClosed
        fun resetDraft(params: EmailResetDraftParams): HttpResponse =
            resetDraft(params, RequestOptions.none())

        /** @see resetDraft */
        @MustBeClosed
        fun resetDraft(emailId: String, requestOptions: RequestOptions): HttpResponse =
            resetDraft(emailId, EmailResetDraftParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /marketing/emails/2026-03/{emailId}/revisions/{revisionId}/restore`, but is otherwise the
         * same as [EmailService.restoreRevision].
         */
        @MustBeClosed
        fun restoreRevision(revisionId: String, params: EmailRestoreRevisionParams): HttpResponse =
            restoreRevision(revisionId, params, RequestOptions.none())

        /** @see restoreRevision */
        @MustBeClosed
        fun restoreRevision(
            revisionId: String,
            params: EmailRestoreRevisionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            restoreRevision(params.toBuilder().revisionId(revisionId).build(), requestOptions)

        /** @see restoreRevision */
        @MustBeClosed
        fun restoreRevision(params: EmailRestoreRevisionParams): HttpResponse =
            restoreRevision(params, RequestOptions.none())

        /** @see restoreRevision */
        @MustBeClosed
        fun restoreRevision(
            params: EmailRestoreRevisionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `post
         * /marketing/emails/2026-03/{emailId}/revisions/{revisionId}/restore-to-draft`, but is
         * otherwise the same as [EmailService.restoreRevisionToDraft].
         */
        @MustBeClosed
        fun restoreRevisionToDraft(
            revisionId: Long,
            params: EmailRestoreRevisionToDraftParams,
        ): HttpResponseFor<PublicEmail> =
            restoreRevisionToDraft(revisionId, params, RequestOptions.none())

        /** @see restoreRevisionToDraft */
        @MustBeClosed
        fun restoreRevisionToDraft(
            revisionId: Long,
            params: EmailRestoreRevisionToDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicEmail> =
            restoreRevisionToDraft(
                params.toBuilder().revisionId(revisionId).build(),
                requestOptions,
            )

        /** @see restoreRevisionToDraft */
        @MustBeClosed
        fun restoreRevisionToDraft(
            params: EmailRestoreRevisionToDraftParams
        ): HttpResponseFor<PublicEmail> = restoreRevisionToDraft(params, RequestOptions.none())

        /** @see restoreRevisionToDraft */
        @MustBeClosed
        fun restoreRevisionToDraft(
            params: EmailRestoreRevisionToDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicEmail>

        /**
         * Returns a raw HTTP response for `post /marketing/emails/2026-03/{emailId}/unpublish`, but
         * is otherwise the same as [EmailService.unpublish].
         */
        @MustBeClosed
        fun unpublish(emailId: String): HttpResponse =
            unpublish(emailId, EmailUnpublishParams.none())

        /** @see unpublish */
        @MustBeClosed
        fun unpublish(
            emailId: String,
            params: EmailUnpublishParams = EmailUnpublishParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = unpublish(params.toBuilder().emailId(emailId).build(), requestOptions)

        /** @see unpublish */
        @MustBeClosed
        fun unpublish(
            emailId: String,
            params: EmailUnpublishParams = EmailUnpublishParams.none(),
        ): HttpResponse = unpublish(emailId, params, RequestOptions.none())

        /** @see unpublish */
        @MustBeClosed
        fun unpublish(
            params: EmailUnpublishParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see unpublish */
        @MustBeClosed
        fun unpublish(params: EmailUnpublishParams): HttpResponse =
            unpublish(params, RequestOptions.none())

        /** @see unpublish */
        @MustBeClosed
        fun unpublish(emailId: String, requestOptions: RequestOptions): HttpResponse =
            unpublish(emailId, EmailUnpublishParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /marketing/emails/2026-03/{emailId}/draft`, but is
         * otherwise the same as [EmailService.updateDraft].
         */
        @MustBeClosed
        fun updateDraft(
            emailId: String,
            params: EmailUpdateDraftParams,
        ): HttpResponseFor<PublicEmail> = updateDraft(emailId, params, RequestOptions.none())

        /** @see updateDraft */
        @MustBeClosed
        fun updateDraft(
            emailId: String,
            params: EmailUpdateDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicEmail> =
            updateDraft(params.toBuilder().emailId(emailId).build(), requestOptions)

        /** @see updateDraft */
        @MustBeClosed
        fun updateDraft(params: EmailUpdateDraftParams): HttpResponseFor<PublicEmail> =
            updateDraft(params, RequestOptions.none())

        /** @see updateDraft */
        @MustBeClosed
        fun updateDraft(
            params: EmailUpdateDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicEmail>
    }
}
