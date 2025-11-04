// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.emails

import com.hubspot_sdk.api.core.AutoPager
import com.hubspot_sdk.api.core.Page
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.services.blocking.marketing.EmailService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see EmailService.listRevisions */
class EmailListRevisionsPage
private constructor(
    private val service: EmailService,
    private val params: EmailListRevisionsParams,
    private val response: CollectionResponseWithTotalVersionPublicEmail,
) : Page<VersionPublicEmail> {

    /**
     * Delegates to [CollectionResponseWithTotalVersionPublicEmail], but gracefully handles missing
     * data.
     *
     * @see CollectionResponseWithTotalVersionPublicEmail.results
     */
    fun results(): List<VersionPublicEmail> =
        response._results().getOptional("results").getOrNull() ?: emptyList()

    /**
     * Delegates to [CollectionResponseWithTotalVersionPublicEmail], but gracefully handles missing
     * data.
     *
     * @see CollectionResponseWithTotalVersionPublicEmail.paging
     */
    fun paging(): Optional<EmailsPaging> = response._paging().getOptional("paging")

    override fun items(): List<VersionPublicEmail> = results()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            paging()
                .flatMap { it._next().getOptional("next") }
                ._after()
                .getOptional("after")
                .isPresent

    fun nextPageParams(): EmailListRevisionsParams {
        val nextCursor =
            paging()
                .flatMap { it._next().getOptional("next") }
                ._after()
                .getOptional("after")
                .getOrNull() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().after(nextCursor).build()
    }

    override fun nextPage(): EmailListRevisionsPage = service.listRevisions(nextPageParams())

    fun autoPager(): AutoPager<VersionPublicEmail> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): EmailListRevisionsParams = params

    /** The response that this page was parsed from. */
    fun response(): CollectionResponseWithTotalVersionPublicEmail = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [EmailListRevisionsPage].
         *
         * The following fields are required:
         * ```java
         * .service()
         * .params()
         * .response()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [EmailListRevisionsPage]. */
    class Builder internal constructor() {

        private var service: EmailService? = null
        private var params: EmailListRevisionsParams? = null
        private var response: CollectionResponseWithTotalVersionPublicEmail? = null

        @JvmSynthetic
        internal fun from(emailListRevisionsPage: EmailListRevisionsPage) = apply {
            service = emailListRevisionsPage.service
            params = emailListRevisionsPage.params
            response = emailListRevisionsPage.response
        }

        fun service(service: EmailService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: EmailListRevisionsParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CollectionResponseWithTotalVersionPublicEmail) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [EmailListRevisionsPage].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .service()
         * .params()
         * .response()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): EmailListRevisionsPage =
            EmailListRevisionsPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EmailListRevisionsPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "EmailListRevisionsPage{service=$service, params=$params, response=$response}"
}
